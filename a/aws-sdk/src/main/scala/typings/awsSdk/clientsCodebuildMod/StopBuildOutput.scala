package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBuildOutput extends StObject {
  
  /**
    * Information about the build.
    */
  var build: js.UndefOr[Build] = js.undefined
}
object StopBuildOutput {
  
  inline def apply(): StopBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBuildOutput]
  }
  
  extension [Self <: StopBuildOutput](x: Self) {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
