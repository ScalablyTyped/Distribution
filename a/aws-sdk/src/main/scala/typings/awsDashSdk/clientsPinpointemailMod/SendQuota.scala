package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendQuota extends js.Object {
  /**
    * The maximum number of emails that you can send in the current AWS Region over a 24-hour period. This value is also called your sending quota.
    */
  var Max24HourSend: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.Max24HourSend] = js.undefined
  /**
    * The maximum number of emails that you can send per second in the current AWS Region. This value is also called your maximum sending rate or your maximum TPS (transactions per second) rate.
    */
  var MaxSendRate: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.MaxSendRate] = js.undefined
  /**
    * The number of emails sent from your Amazon Pinpoint account in the current AWS Region over the past 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.SentLast24Hours] = js.undefined
}

object SendQuota {
  @scala.inline
  def apply(
    Max24HourSend: Int | Double = null,
    MaxSendRate: Int | Double = null,
    SentLast24Hours: Int | Double = null
  ): SendQuota = {
    val __obj = js.Dynamic.literal()
    if (Max24HourSend != null) __obj.updateDynamic("Max24HourSend")(Max24HourSend.asInstanceOf[js.Any])
    if (MaxSendRate != null) __obj.updateDynamic("MaxSendRate")(MaxSendRate.asInstanceOf[js.Any])
    if (SentLast24Hours != null) __obj.updateDynamic("SentLast24Hours")(SentLast24Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendQuota]
  }
}

