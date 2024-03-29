package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCodeSigningConfigRequest extends StObject {
  
  /**
    * The The Amazon Resource Name (ARN) of the code signing configuration.
    */
  var CodeSigningConfigArn: typings.awsSdk.clientsLambdaMod.CodeSigningConfigArn
}
object DeleteCodeSigningConfigRequest {
  
  inline def apply(CodeSigningConfigArn: CodeSigningConfigArn): DeleteCodeSigningConfigRequest = {
    val __obj = js.Dynamic.literal(CodeSigningConfigArn = CodeSigningConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCodeSigningConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCodeSigningConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setCodeSigningConfigArn(value: CodeSigningConfigArn): Self = StObject.set(x, "CodeSigningConfigArn", value.asInstanceOf[js.Any])
  }
}
