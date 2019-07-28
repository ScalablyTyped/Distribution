package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequest extends _CloudFrontRequestResult {
  var clientIp: String
  var headers: CloudFrontHeaders
  var method: String
  var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  var querystring: String
  var uri: String
}

object CloudFrontRequest {
  @scala.inline
  def apply(
    clientIp: String,
    headers: CloudFrontHeaders,
    method: String,
    querystring: String,
    uri: String,
    origin: CloudFrontOrigin = null
  ): CloudFrontRequest = {
    val __obj = js.Dynamic.literal(clientIp = clientIp, headers = headers, method = method, querystring = querystring, uri = uri)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[CloudFrontRequest]
  }
}

