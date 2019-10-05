package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPreviewResult extends js.Object {
  /**
    * The type of action to be taken.
    */
  var action: js.UndefOr[LifecyclePolicyRuleAction] = js.undefined
  /**
    * The priority of the applied rule.
    */
  var appliedRulePriority: js.UndefOr[LifecyclePolicyRulePriority] = js.undefined
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository.
    */
  var imagePushedAt: js.UndefOr[PushTimestamp] = js.undefined
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.undefined
}

object LifecyclePolicyPreviewResult {
  @scala.inline
  def apply(
    action: LifecyclePolicyRuleAction = null,
    appliedRulePriority: Int | Double = null,
    imageDigest: ImageDigest = null,
    imagePushedAt: PushTimestamp = null,
    imageTags: ImageTagList = null
  ): LifecyclePolicyPreviewResult = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (appliedRulePriority != null) __obj.updateDynamic("appliedRulePriority")(appliedRulePriority.asInstanceOf[js.Any])
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest)
    if (imagePushedAt != null) __obj.updateDynamic("imagePushedAt")(imagePushedAt)
    if (imageTags != null) __obj.updateDynamic("imageTags")(imageTags)
    __obj.asInstanceOf[LifecyclePolicyPreviewResult]
  }
}

