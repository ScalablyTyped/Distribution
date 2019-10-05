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
    Status2xx: Int | Double = null,
    Status3xx: Int | Double = null,
    Status4xx: Int | Double = null,
    Status5xx: Int | Double = null
  ): StatusCodes = {
    val __obj = js.Dynamic.literal()
    if (Status2xx != null) __obj.updateDynamic("Status2xx")(Status2xx.asInstanceOf[js.Any])
    if (Status3xx != null) __obj.updateDynamic("Status3xx")(Status3xx.asInstanceOf[js.Any])
    if (Status4xx != null) __obj.updateDynamic("Status4xx")(Status4xx.asInstanceOf[js.Any])
    if (Status5xx != null) __obj.updateDynamic("Status5xx")(Status5xx.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCodes]
  }
}

