package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  var build: String | Null
  
  var major: Double
  
  var minor: Double
  
  var patch: Double
  
  var prerelease: String | Null
}
object Build {
  
  inline def apply(major: Double, minor: Double, patch: Double): Build = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], build = null, prerelease = null)
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildNull: Self = StObject.set(x, "build", null)
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseNull: Self = StObject.set(x, "prerelease", null)
  }
}
