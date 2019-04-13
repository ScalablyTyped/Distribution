package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeStatistics extends js.Object {
  /**
    * The total number of emails that arrived in recipients' inboxes.
    */
  var InboxRawCount: js.UndefOr[Volume] = js.undefined
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' inboxes.
    */
  var ProjectedInbox: js.UndefOr[Volume] = js.undefined
  /**
    * An estimate of the percentage of emails sent from the current domain that will arrive in recipients' spam or junk mail folders.
    */
  var ProjectedSpam: js.UndefOr[Volume] = js.undefined
  /**
    * The total number of emails that arrived in recipients' spam or junk mail folders.
    */
  var SpamRawCount: js.UndefOr[Volume] = js.undefined
}

object VolumeStatistics {
  @scala.inline
  def apply(
    InboxRawCount: js.UndefOr[Volume] = js.undefined,
    ProjectedInbox: js.UndefOr[Volume] = js.undefined,
    ProjectedSpam: js.UndefOr[Volume] = js.undefined,
    SpamRawCount: js.UndefOr[Volume] = js.undefined
  ): VolumeStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InboxRawCount)) __obj.updateDynamic("InboxRawCount")(InboxRawCount)
    if (!js.isUndefined(ProjectedInbox)) __obj.updateDynamic("ProjectedInbox")(ProjectedInbox)
    if (!js.isUndefined(ProjectedSpam)) __obj.updateDynamic("ProjectedSpam")(ProjectedSpam)
    if (!js.isUndefined(SpamRawCount)) __obj.updateDynamic("SpamRawCount")(SpamRawCount)
    __obj.asInstanceOf[VolumeStatistics]
  }
}

