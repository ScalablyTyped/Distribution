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

