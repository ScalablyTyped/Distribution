package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRecipePolicyResponse extends js.Object {
  /**
    *  The image recipe policy object. 
    */
  var policy: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetImageRecipePolicyResponse {
  @scala.inline
  def apply(policy: NonEmptyString = null, requestId: NonEmptyString = null): GetImageRecipePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRecipePolicyResponse]
  }
}

