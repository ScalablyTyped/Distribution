package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBuildOutput extends StObject {
  
  /**
    * Information about the build to be run.
    */
  var build: js.UndefOr[Build] = js.undefined
}
object StartBuildOutput {
  
  inline def apply(): StartBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBuildOutput]
  }
  
  extension [Self <: StartBuildOutput](x: Self) {
    
    inline def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
