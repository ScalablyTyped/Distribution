package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRecipeRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that you wish to retrieve. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
}

object GetImageRecipeRequest {
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn): GetImageRecipeRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetImageRecipeRequest]
  }
}

