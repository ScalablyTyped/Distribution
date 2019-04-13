package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStatisticsDocument extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[BorrowCount] = js.undefined
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: awsDashSdkLib.clientsXrayMod.ClientID
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: awsDashSdkLib.clientsXrayMod.RequestCount
  /**
    * The name of the sampling rule.
    */
  var RuleName: awsDashSdkLib.clientsXrayMod.RuleName
  /**
    * The number of requests recorded.
    */
  var SampledCount: awsDashSdkLib.clientsXrayMod.SampledCount
  /**
    * The current time.
    */
  var Timestamp: awsDashSdkLib.clientsXrayMod.Timestamp
}

object SamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: Timestamp,
    BorrowCount: js.UndefOr[BorrowCount] = js.undefined
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID, RequestCount = RequestCount, RuleName = RuleName, SampledCount = SampledCount, Timestamp = Timestamp)
    if (!js.isUndefined(BorrowCount)) __obj.updateDynamic("BorrowCount")(BorrowCount)
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
}

