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
  /** FieldStat name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** FieldStat requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
  /** FieldStat returnType */
  var returnType: js.UndefOr[String | Null] = js.undefined
}

object IFieldStat {
  @scala.inline
  def apply(
    count: Int | Double = null,
    errorsCount: Int | Double = null,
    latencyCount: js.Array[Double] = null,
    name: String = null,
    requestsWithErrorsCount: Int | Double = null,
    returnType: String = null
  ): IFieldStat = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (errorsCount != null) __obj.updateDynamic("errorsCount")(errorsCount.asInstanceOf[js.Any])
    if (latencyCount != null) __obj.updateDynamic("latencyCount")(latencyCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldStat]
  }
}

