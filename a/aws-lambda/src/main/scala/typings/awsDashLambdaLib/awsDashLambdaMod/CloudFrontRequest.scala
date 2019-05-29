package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequest extends _CloudFrontRequestResult {
  var clientIp: java.lang.String
  var headers: CloudFrontHeaders
  var method: java.lang.String
  var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  var querystring: java.lang.String
  var uri: java.lang.String
}

object CloudFrontRequest {
  @scala.inline
  def apply(
    clientIp: java.lang.String,
    headers: CloudFrontHeaders,
    method: java.lang.String,
    querystring: java.lang.String,
    uri: java.lang.String,
    origin: CloudFrontOrigin = null
  ): CloudFrontRequest = {
    val __obj = js.Dynamic.literal(clientIp = clientIp, headers = headers, method = method, querystring = querystring, uri = uri)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[CloudFrontRequest]
  }
}

