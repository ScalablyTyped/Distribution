package typings.awsLambda.cloudfrontMod

import typings.awsLambda.anon.Action
import typings.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontRequest extends _CloudFrontRequestResult {
  var body: js.UndefOr[Action] = js.undefined
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
    body: Action = null,
    origin: CloudFrontOrigin = null
  ): CloudFrontRequest = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontRequest]
  }
}

