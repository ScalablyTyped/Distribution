package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResultResponse extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var bodyEncoding: js.UndefOr[
    awsDashLambdaLib.awsDashLambdaLibStrings.text | awsDashLambdaLib.awsDashLambdaLibStrings.base64
  ] = js.undefined
  var headers: js.UndefOr[CloudFrontHeaders] = js.undefined
  var status: java.lang.String
  var statusDescription: js.UndefOr[java.lang.String] = js.undefined
}

object CloudFrontResultResponse {
  @scala.inline
  def apply(
    status: java.lang.String,
    body: java.lang.String = null,
    bodyEncoding: awsDashLambdaLib.awsDashLambdaLibStrings.text | awsDashLambdaLib.awsDashLambdaLibStrings.base64 = null,
    headers: CloudFrontHeaders = null,
    statusDescription: java.lang.String = null
  ): CloudFrontResultResponse = {
    val __obj = js.Dynamic.literal(status = status)
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyEncoding != null) __obj.updateDynamic("bodyEncoding")(bodyEncoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusDescription != null) __obj.updateDynamic("statusDescription")(statusDescription)
    __obj.asInstanceOf[CloudFrontResultResponse]
  }
}

