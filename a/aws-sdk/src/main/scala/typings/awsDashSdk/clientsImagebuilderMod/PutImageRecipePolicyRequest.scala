package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageRecipePolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that this policy should be applied to. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    *  The policy to apply. 
    */
  var policy: NonEmptyString = js.native
}

object PutImageRecipePolicyRequest {
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn, policy: NonEmptyString): PutImageRecipePolicyRequest = {
    val __obj = js.Dynamic.literal(imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutImageRecipePolicyRequest]
  }
}

