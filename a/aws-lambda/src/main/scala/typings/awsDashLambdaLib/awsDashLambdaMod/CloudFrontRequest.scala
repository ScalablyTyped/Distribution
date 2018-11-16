package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CloudFrontRequest extends js.Object {
  var clientIp: java.lang.String
  var headers: CloudFrontHeaders
  var method: java.lang.String
  var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
  var querystring: java.lang.String
  var uri: java.lang.String
}

