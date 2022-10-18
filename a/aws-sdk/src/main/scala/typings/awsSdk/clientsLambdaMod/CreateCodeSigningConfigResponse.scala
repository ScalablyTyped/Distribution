package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCodeSigningConfigResponse extends StObject {
  
  /**
    * The code signing configuration.
    */
  var CodeSigningConfig: typings.awsSdk.clientsLambdaMod.CodeSigningConfig
}
object CreateCodeSigningConfigResponse {
  
  inline def apply(CodeSigningConfig: CodeSigningConfig): CreateCodeSigningConfigResponse = {
    val __obj = js.Dynamic.literal(CodeSigningConfig = CodeSigningConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeSigningConfigResponse]
  }
  
  extension [Self <: CreateCodeSigningConfigResponse](x: Self) {
    
    inline def setCodeSigningConfig(value: CodeSigningConfig): Self = StObject.set(x, "CodeSigningConfig", value.asInstanceOf[js.Any])
  }
}
