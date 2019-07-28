package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSendQuotaResponse extends js.Object {
  /**
    * The maximum number of emails the user is allowed to send in a 24-hour interval. A value of -1 signifies an unlimited quota.
    */
  var Max24HourSend: js.UndefOr[typings.awsDashSdk.clientsSesMod.Max24HourSend] = js.undefined
  /**
    * The maximum number of emails that Amazon SES can accept from the user's account per second.  The rate at which Amazon SES accepts the user's messages might be less than the maximum send rate. 
    */
  var MaxSendRate: js.UndefOr[typings.awsDashSdk.clientsSesMod.MaxSendRate] = js.undefined
  /**
    * The number of emails sent during the previous 24 hours.
    */
  var SentLast24Hours: js.UndefOr[typings.awsDashSdk.clientsSesMod.SentLast24Hours] = js.undefined
}

object GetSendQuotaResponse {
  @scala.inline
  def apply(
    Max24HourSend: js.UndefOr[Max24HourSend] = js.undefined,
    MaxSendRate: js.UndefOr[MaxSendRate] = js.undefined,
    SentLast24Hours: js.UndefOr[SentLast24Hours] = js.undefined
  ): GetSendQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Max24HourSend)) __obj.updateDynamic("Max24HourSend")(Max24HourSend)
    if (!js.isUndefined(MaxSendRate)) __obj.updateDynamic("MaxSendRate")(MaxSendRate)
    if (!js.isUndefined(SentLast24Hours)) __obj.updateDynamic("SentLast24Hours")(SentLast24Hours)
    __obj.asInstanceOf[GetSendQuotaResponse]
  }
}

