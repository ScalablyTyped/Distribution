package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressedDestination extends js.Object {
  /**
    * An optional value that can contain additional information about the reasons that the address was added to the suppression list for your account.
    */
  var Attributes: js.UndefOr[SuppressedDestinationAttributes] = js.native
  /**
    * The email address that is on the suppression list for your account.
    */
  var EmailAddress: typings.awsDashSdk.clientsSesv2Mod.EmailAddress = js.native
  /**
    * The date and time when the suppressed destination was last updated, shown in Unix time format.
    */
  var LastUpdateTime: Timestamp = js.native
  /**
    * The reason that the address was added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}

object SuppressedDestination {
  @scala.inline
  def apply(
    EmailAddress: EmailAddress,
    LastUpdateTime: Timestamp,
    Reason: SuppressionListReason,
    Attributes: SuppressedDestinationAttributes = null
  ): SuppressedDestination = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestination]
  }
}

