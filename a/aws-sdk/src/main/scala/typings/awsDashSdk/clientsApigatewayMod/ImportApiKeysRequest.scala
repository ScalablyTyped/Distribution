package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportApiKeysRequest extends js.Object {
  /**
    * The payload of the POST request to import API keys. For the payload format, see API Key File Format.
    */
  var body: _Blob
  /**
    * A query parameter to indicate whether to rollback ApiKey importation (true) or not (false) when error is encountered.
    */
  var failOnWarnings: js.UndefOr[Boolean] = js.undefined
  /**
    * A query parameter to specify the input format to imported API keys. Currently, only the csv format is supported.
    */
  var format: ApiKeysFormat
}

object ImportApiKeysRequest {
  @scala.inline
  def apply(body: _Blob, format: ApiKeysFormat, failOnWarnings: js.UndefOr[scala.Boolean] = js.undefined): ImportApiKeysRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnWarnings)) __obj.updateDynamic("failOnWarnings")(failOnWarnings)
    __obj.asInstanceOf[ImportApiKeysRequest]
  }
}

