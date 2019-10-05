package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Error. */
trait IError extends js.Object {
  /** Error json */
  var json: js.UndefOr[String | Null] = js.undefined
  /** Error location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
  /** Error message */
  var message: js.UndefOr[String | Null] = js.undefined
  /** Error timeNs */
  var timeNs: js.UndefOr[Double | Null] = js.undefined
}

object IError {
  @scala.inline
  def apply(
    json: String = null,
    location: js.Array[ILocation] = null,
    message: String = null,
    timeNs: Int | Double = null
  ): IError = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json)
    if (location != null) __obj.updateDynamic("location")(location)
    if (message != null) __obj.updateDynamic("message")(message)
    if (timeNs != null) __obj.updateDynamic("timeNs")(timeNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
}

