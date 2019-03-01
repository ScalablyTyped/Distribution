package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldStat extends js.Object {
  /** FieldStat count */
  var count: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** FieldStat errorsCount */
  var errorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** FieldStat latencyCount */
  var latencyCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** FieldStat name */
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** FieldStat requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** FieldStat returnType */
  var returnType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object IFieldStat {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    errorsCount: scala.Int | scala.Double = null,
    latencyCount: js.Array[scala.Double] = null,
    name: java.lang.String = null,
    requestsWithErrorsCount: scala.Int | scala.Double = null,
    returnType: java.lang.String = null
  ): IFieldStat = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (errorsCount != null) __obj.updateDynamic("errorsCount")(errorsCount.asInstanceOf[js.Any])
    if (latencyCount != null) __obj.updateDynamic("latencyCount")(latencyCount)
    if (name != null) __obj.updateDynamic("name")(name)
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    __obj.asInstanceOf[IFieldStat]
  }
}

