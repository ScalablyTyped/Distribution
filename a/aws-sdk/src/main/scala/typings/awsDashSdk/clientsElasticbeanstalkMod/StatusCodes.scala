package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusCodes extends js.Object {
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
    */
  var Status2xx: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
    */
  var Status3xx: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
    */
  var Status4xx: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
    */
  var Status5xx: js.UndefOr[NullableInteger] = js.undefined
}

object StatusCodes {
  @scala.inline
  def apply(
    Status2xx: js.UndefOr[NullableInteger] = js.undefined,
    Status3xx: js.UndefOr[NullableInteger] = js.undefined,
    Status4xx: js.UndefOr[NullableInteger] = js.undefined,
    Status5xx: js.UndefOr[NullableInteger] = js.undefined
  ): StatusCodes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Status2xx)) __obj.updateDynamic("Status2xx")(Status2xx)
    if (!js.isUndefined(Status3xx)) __obj.updateDynamic("Status3xx")(Status3xx)
    if (!js.isUndefined(Status4xx)) __obj.updateDynamic("Status4xx")(Status4xx)
    if (!js.isUndefined(Status5xx)) __obj.updateDynamic("Status5xx")(Status5xx)
    __obj.asInstanceOf[StatusCodes]
  }
}

