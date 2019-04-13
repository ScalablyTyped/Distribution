package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPreviewFilter extends js.Object {
  /**
    * The tag status of the image.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.undefined
}

object LifecyclePolicyPreviewFilter {
  @scala.inline
  def apply(tagStatus: TagStatus = null): LifecyclePolicyPreviewFilter = {
    val __obj = js.Dynamic.literal()
    if (tagStatus != null) __obj.updateDynamic("tagStatus")(tagStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPreviewFilter]
  }
}

