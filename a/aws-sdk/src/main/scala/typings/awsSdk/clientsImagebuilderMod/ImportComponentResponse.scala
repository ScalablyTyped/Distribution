package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportComponentResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the imported component.
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ImportComponentResponse {
  
  inline def apply(): ImportComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportComponentResponse]
  }
  
  extension [Self <: ImportComponentResponse](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setComponentBuildVersionArnUndefined: Self = StObject.set(x, "componentBuildVersionArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
