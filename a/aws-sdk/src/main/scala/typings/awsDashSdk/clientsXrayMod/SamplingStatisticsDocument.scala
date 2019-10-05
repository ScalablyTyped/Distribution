package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStatisticsDocument extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typings.awsDashSdk.clientsXrayMod.BorrowCount] = js.undefined
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typings.awsDashSdk.clientsXrayMod.ClientID
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typings.awsDashSdk.clientsXrayMod.RequestCount
  /**
    * The name of the sampling rule.
    */
  var RuleName: typings.awsDashSdk.clientsXrayMod.RuleName
  /**
    * The number of requests recorded.
    */
  var SampledCount: typings.awsDashSdk.clientsXrayMod.SampledCount
  /**
    * The current time.
    */
  var Timestamp: typings.awsDashSdk.clientsXrayMod.Timestamp
}

object SamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: Timestamp,
    BorrowCount: Int | scala.Double = null
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID, RequestCount = RequestCount, RuleName = RuleName, SampledCount = SampledCount, Timestamp = Timestamp)
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
}

