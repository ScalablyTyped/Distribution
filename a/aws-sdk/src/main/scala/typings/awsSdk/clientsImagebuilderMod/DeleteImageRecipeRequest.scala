package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImageRecipeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe to delete.
    */
  var imageRecipeArn: ImageRecipeArn
}
object DeleteImageRecipeRequest {
  
  inline def apply(imageRecipeArn: ImageRecipeArn): DeleteImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRecipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteImageRecipeRequest] (val x: Self) extends AnyVal {
    
    inline def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
