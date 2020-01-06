package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPreviewFilter extends js.Object {
  /**
    * The tag status of the image.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.native
}

object LifecyclePolicyPreviewFilter {
  @scala.inline
  def apply(tagStatus: TagStatus = null): LifecyclePolicyPreviewFilter = {
    val __obj = js.Dynamic.literal()
    if (tagStatus != null) __obj.updateDynamic("tagStatus")(tagStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPreviewFilter]
  }
}

