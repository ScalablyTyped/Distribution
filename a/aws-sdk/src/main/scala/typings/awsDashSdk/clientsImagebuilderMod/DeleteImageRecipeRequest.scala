package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageRecipeRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image recipe to delete. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
}

object DeleteImageRecipeRequest {
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn): DeleteImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteImageRecipeRequest]
  }
}

