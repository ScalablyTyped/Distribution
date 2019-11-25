package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.awsDashLambdaStrings.base64
import typings.awsDashLambda.awsDashLambdaStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResultResponse extends _CloudFrontRequestResult {
  var body: js.UndefOr[String] = js.undefined
  var bodyEncoding: js.UndefOr[text_ | base64] = js.undefined
  var headers: js.UndefOr[CloudFrontHeaders] = js.undefined
  var status: String
  var statusDescription: js.UndefOr[String] = js.undefined
}

object CloudFrontResultResponse {
  @scala.inline
  def apply(
    status: String,
    body: String = null,
    bodyEncoding: text_ | base64 = null,
    headers: CloudFrontHeaders = null,
    statusDescription: String = null
  ): CloudFrontResultResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyEncoding != null) __obj.updateDynamic("bodyEncoding")(bodyEncoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusDescription != null) __obj.updateDynamic("statusDescription")(statusDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontResultResponse]
  }
}

