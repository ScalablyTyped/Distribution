package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementStatistics extends js.Object {
  /**
    * The percentage of emails that were authenticated by using DomainKeys Identified Mail (DKIM) during the predictive inbox placement test.
    */
  var DkimPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The percentage of emails that arrived in recipients' inboxes during the predictive inbox placement test.
    */
  var InboxPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The percentage of emails that didn't arrive in recipients' inboxes at all during the predictive inbox placement test.
    */
  var MissingPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The percentage of emails that arrived in recipients' spam or junk mail folders during the predictive inbox placement test.
    */
  var SpamPercentage: js.UndefOr[Percentage] = js.undefined
  /**
    * The percentage of emails that were authenticated by using Sender Policy Framework (SPF) during the predictive inbox placement test.
    */
  var SpfPercentage: js.UndefOr[Percentage] = js.undefined
}

object PlacementStatistics {
  @scala.inline
  def apply(
    DkimPercentage: js.UndefOr[Percentage] = js.undefined,
    InboxPercentage: js.UndefOr[Percentage] = js.undefined,
    MissingPercentage: js.UndefOr[Percentage] = js.undefined,
    SpamPercentage: js.UndefOr[Percentage] = js.undefined,
    SpfPercentage: js.UndefOr[Percentage] = js.undefined
  ): PlacementStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DkimPercentage)) __obj.updateDynamic("DkimPercentage")(DkimPercentage)
    if (!js.isUndefined(InboxPercentage)) __obj.updateDynamic("InboxPercentage")(InboxPercentage)
    if (!js.isUndefined(MissingPercentage)) __obj.updateDynamic("MissingPercentage")(MissingPercentage)
    if (!js.isUndefined(SpamPercentage)) __obj.updateDynamic("SpamPercentage")(SpamPercentage)
    if (!js.isUndefined(SpfPercentage)) __obj.updateDynamic("SpfPercentage")(SpfPercentage)
    __obj.asInstanceOf[PlacementStatistics]
  }
}

