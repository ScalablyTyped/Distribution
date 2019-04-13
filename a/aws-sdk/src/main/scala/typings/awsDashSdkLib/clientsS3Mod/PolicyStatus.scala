package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyStatus extends js.Object {
  /**
    * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
    */
  var IsPublic: js.UndefOr[IsPublic] = js.undefined
}

object PolicyStatus {
  @scala.inline
  def apply(IsPublic: js.UndefOr[IsPublic] = js.undefined): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsPublic)) __obj.updateDynamic("IsPublic")(IsPublic)
    __obj.asInstanceOf[PolicyStatus]
  }
}

