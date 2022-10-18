package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelImageCreationRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see Ensuring idempotency in the Amazon EC2 API Reference.
    */
  var clientToken: ClientToken
  
  /**
    * The Amazon Resource Name (ARN) of the image whose creation you want to cancel.
    */
  var imageBuildVersionArn: ImageBuildVersionArn
}
object CancelImageCreationRequest {
  
  inline def apply(clientToken: ClientToken, imageBuildVersionArn: ImageBuildVersionArn): CancelImageCreationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImageCreationRequest]
  }
  
  extension [Self <: CancelImageCreationRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = StObject.set(x, "imageBuildVersionArn", value.asInstanceOf[js.Any])
  }
}
