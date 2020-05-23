package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatsContext extends js.Object {
  /** StatsContext clientName */
  var clientName: js.UndefOr[String | Null] = js.undefined
  /** StatsContext clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.undefined
  /** StatsContext clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
}

object IStatsContext {
  @scala.inline
  def apply(
    clientName: js.UndefOr[Null | String] = js.undefined,
    clientReferenceId: js.UndefOr[Null | String] = js.undefined,
    clientVersion: js.UndefOr[Null | String] = js.undefined
  ): IStatsContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientName)) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (!js.isUndefined(clientReferenceId)) __obj.updateDynamic("clientReferenceId")(clientReferenceId.asInstanceOf[js.Any])
    if (!js.isUndefined(clientVersion)) __obj.updateDynamic("clientVersion")(clientVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatsContext]
  }
}

