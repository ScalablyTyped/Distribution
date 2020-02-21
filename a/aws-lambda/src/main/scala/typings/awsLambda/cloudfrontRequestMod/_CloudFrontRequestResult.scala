package typings.awsLambda.cloudfrontRequestMod

import typings.awsLambda.AnonAction
import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.text_
import typings.awsLambda.cloudfrontMod.CloudFrontHeaders
import typings.awsLambda.cloudfrontMod.CloudFrontOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CloudFrontRequestResult extends js.Object

object _CloudFrontRequestResult {
  @scala.inline
  def CloudFrontResultResponse(
    status: String,
    body: String = null,
    bodyEncoding: text_ | base64 = null,
    headers: CloudFrontHeaders = null,
    statusDescription: String = null
  ): _CloudFrontRequestResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyEncoding != null) __obj.updateDynamic("bodyEncoding")(bodyEncoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusDescription != null) __obj.updateDynamic("statusDescription")(statusDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CloudFrontRequestResult]
  }
  @scala.inline
  def CloudFrontRequest(
    clientIp: String,
    headers: CloudFrontHeaders,
    method: String,
    querystring: String,
    uri: String,
    body: AnonAction = null,
    origin: CloudFrontOrigin = null
  ): _CloudFrontRequestResult = {
    val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CloudFrontRequestResult]
  }
}

