package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component build version that was deleted.
    */
  var componentBuildVersionArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object DeleteComponentResponse {
  
  inline def apply(): DeleteComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteComponentResponse]
  }
  
  extension [Self <: DeleteComponentResponse](x: Self) {
    
    inline def setComponentBuildVersionArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentBuildVersionArn", value.asInstanceOf[js.Any])
    
    inline def setComponentBuildVersionArnUndefined: Self = StObject.set(x, "componentBuildVersionArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
