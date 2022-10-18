package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutImageRecipePolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that this policy was applied to.
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object PutImageRecipePolicyResponse {
  
  inline def apply(): PutImageRecipePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageRecipePolicyResponse]
  }
  
  extension [Self <: PutImageRecipePolicyResponse](x: Self) {
    
    inline def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
    
    inline def setImageRecipeArnUndefined: Self = StObject.set(x, "imageRecipeArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
