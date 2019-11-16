package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_ActionBase64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequest extends _CloudFrontRequestResult {
  var body: js.UndefOr[Anon_ActionBase64] = js.undefined
  val clientIp: String
  var headers: CloudFrontHeaders
  val method: String
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
    body: Anon_ActionBase64 = null,
    origin: CloudFrontOrigin = null
  ): CloudFrontRequest = {
    val __obj = js.Dynamic.literal(clientIp = clientIp, headers = headers, method = method, querystring = querystring, uri = uri)
    if (body != null) __obj.updateDynamic("body")(body)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[CloudFrontRequest]
  }
}

