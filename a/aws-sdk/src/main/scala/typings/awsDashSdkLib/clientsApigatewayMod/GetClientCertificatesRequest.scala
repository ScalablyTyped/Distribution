package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientCertificatesRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
}

object GetClientCertificatesRequest {
  @scala.inline
  def apply(limit: js.UndefOr[NullableInteger] = js.undefined, position: String = null): GetClientCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetClientCertificatesRequest]
  }
}

