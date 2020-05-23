package typings.apolloEngineReportingProtobuf.protobufMod.Trace

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
    json: js.UndefOr[Null | String] = js.undefined,
    location: js.UndefOr[Null | js.Array[ILocation]] = js.undefined,
    message: js.UndefOr[Null | String] = js.undefined,
    timeNs: js.UndefOr[Null | Double] = js.undefined
  ): IError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(message)) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(timeNs)) __obj.updateDynamic("timeNs")(timeNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
}

