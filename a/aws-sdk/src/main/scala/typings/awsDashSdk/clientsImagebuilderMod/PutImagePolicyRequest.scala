package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImagePolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image that this policy should be applied to. 
    */
  var imageArn: ImageBuildVersionArn = js.native
  /**
    *  The policy to apply. 
    */
  var policy: NonEmptyString = js.native
}

object PutImagePolicyRequest {
  @scala.inline
  def apply(imageArn: ImageBuildVersionArn, policy: NonEmptyString): PutImagePolicyRequest = {
    val __obj = js.Dynamic.literal(imageArn = imageArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutImagePolicyRequest]
  }
}

