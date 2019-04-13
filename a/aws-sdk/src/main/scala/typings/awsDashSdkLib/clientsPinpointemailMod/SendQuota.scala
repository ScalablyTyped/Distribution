package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendQuota extends js.Object {
  /**
    * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
    */
  var Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined
  /**
    * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
    */
  var MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined
  /**
    * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
    */
  var SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
}

object SendQuota {
  @scala.inline
  def apply(
    Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
    MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
    SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
  ): SendQuota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Max24HourSend)) __obj.updateDynamic("Max24HourSend")(Max24HourSend)
    if (!js.isUndefined(MaxSendRate)) __obj.updateDynamic("MaxSendRate")(MaxSendRate)
    if (!js.isUndefined(SentLast24Hours)) __obj.updateDynamic("SentLast24Hours")(SentLast24Hours)
    __obj.asInstanceOf[SendQuota]
  }
}

