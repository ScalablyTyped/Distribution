package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCodeSigningConfigRequest extends StObject {
  
  /**
    * The The Amazon Resource Name (ARN) of the code signing configuration. 
    */
  var CodeSigningConfigArn: typings.awsSdk.clientsLambdaMod.CodeSigningConfigArn
}
object GetCodeSigningConfigRequest {
  
  inline def apply(CodeSigningConfigArn: CodeSigningConfigArn): GetCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(CodeSigningConfigArn = CodeSigningConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCodeSigningConfigRequest]
  }
  
  extension [Self <: GetCodeSigningConfigRequest](x: Self) {
    
    inline def setCodeSigningConfigArn(value: CodeSigningConfigArn): Self = StObject.set(x, "CodeSigningConfigArn", value.asInstanceOf[js.Any])
  }
}
