package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitSubmodulesConfig extends StObject {
  
  /**
    *  Set to true to fetch Git submodules for your CodeBuild build project. 
    */
  var fetchSubmodules: WrapperBoolean
}
object GitSubmodulesConfig {
  
  inline def apply(fetchSubmodules: WrapperBoolean): GitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitSubmodulesConfig]
  }
  
  extension [Self <: GitSubmodulesConfig](x: Self) {
    
    inline def setFetchSubmodules(value: WrapperBoolean): Self = StObject.set(x, "fetchSubmodules", value.asInstanceOf[js.Any])
  }
}
