package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldStat extends js.Object {
  /** FieldStat count */
  var count: js.UndefOr[Double | Null] = js.undefined
  /** FieldStat errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.undefined
  /** FieldStat latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** FieldStat requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
  /** FieldStat returnType */
  var returnType: js.UndefOr[String | Null] = js.undefined
}

object IFieldStat {
  @scala.inline
  def apply(
    count: js.UndefOr[Null | Double] = js.undefined,
    errorsCount: js.UndefOr[Null | Double] = js.undefined,
    latencyCount: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    requestsWithErrorsCount: js.UndefOr[Null | Double] = js.undefined,
    returnType: js.UndefOr[Null | String] = js.undefined
  ): IFieldStat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(errorsCount)) __obj.updateDynamic("errorsCount")(errorsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(latencyCount)) __obj.updateDynamic("latencyCount")(latencyCount.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsWithErrorsCount)) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(returnType)) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldStat]
  }
}

