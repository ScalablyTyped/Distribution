package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesVersionMod {
  
  @JSImport("@angular/cli/src/utilities/version", "VERSION")
  @js.native
  val VERSION_ : Version = js.native
  
  trait Version extends StObject {
    
    val full: String
    
    val major: String
    
    val minor: String
    
    val patch: String
  }
  object Version {
    
    inline def apply(full: String, major: String, minor: String, patch: String): Version = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    }
  }
}
