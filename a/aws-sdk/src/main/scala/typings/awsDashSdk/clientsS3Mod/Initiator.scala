package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initiator extends js.Object {
  /**
    * Name of the Principal.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DisplayName] = js.undefined
  /**
    * If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.
    */
  var ID: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ID] = js.undefined
}

object Initiator {
  @scala.inline
  def apply(DisplayName: DisplayName = null, ID: ID = null): Initiator = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[Initiator]
  }
}

