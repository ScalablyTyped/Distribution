package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageRecipeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that you want to retrieve.
    */
  var imageRecipeArn: ImageRecipeArn
}
object GetImageRecipeRequest {
  
  inline def apply(imageRecipeArn: ImageRecipeArn): GetImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRecipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImageRecipeRequest] (val x: Self) extends AnyVal {
    
    inline def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
  }
}
