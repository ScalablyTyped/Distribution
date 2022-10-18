package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageRecipeResponse extends StObject {
  
  /**
    * The image recipe object.
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetImageRecipeResponse {
  
  inline def apply(): GetImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImageRecipeResponse]
  }
  
  extension [Self <: GetImageRecipeResponse](x: Self) {
    
    inline def setImageRecipe(value: ImageRecipe): Self = StObject.set(x, "imageRecipe", value.asInstanceOf[js.Any])
    
    inline def setImageRecipeUndefined: Self = StObject.set(x, "imageRecipe", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
