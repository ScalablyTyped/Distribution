package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStatus extends js.Object {
  /**
    * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
    */
  var IsPublic: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsPublic] = js.undefined
}

object PolicyStatus {
  @scala.inline
  def apply(IsPublic: js.UndefOr[Boolean] = js.undefined): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsPublic)) __obj.updateDynamic("IsPublic")(IsPublic)
    __obj.asInstanceOf[PolicyStatus]
  }
}

