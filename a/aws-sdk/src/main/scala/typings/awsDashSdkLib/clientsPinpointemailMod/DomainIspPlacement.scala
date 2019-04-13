package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainIspPlacement extends js.Object {
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.undefined
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[IspName] = js.undefined
  /**
    * The percentage of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The total number of messages that were sent from the selected domain to the specified email provider that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.undefined
}

object DomainIspPlacement {
  @scala.inline
  def apply(
    InboxPercentage: js.UndefOr[Percentage] = js.undefined,
    InboxRawCount: js.UndefOr[Volume] = js.undefined,
    IspName: IspName = null,
    SpamPercentage: js.UndefOr[Percentage] = js.undefined,
    SpamRawCount: js.UndefOr[Volume] = js.undefined
  ): DomainIspPlacement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InboxPercentage)) __obj.updateDynamic("InboxPercentage")(InboxPercentage)
    if (!js.isUndefined(InboxRawCount)) __obj.updateDynamic("InboxRawCount")(InboxRawCount)
    if (IspName != null) __obj.updateDynamic("IspName")(IspName)
    if (!js.isUndefined(SpamPercentage)) __obj.updateDynamic("SpamPercentage")(SpamPercentage)
    if (!js.isUndefined(SpamRawCount)) __obj.updateDynamic("SpamRawCount")(SpamRawCount)
    __obj.asInstanceOf[DomainIspPlacement]
  }
}

