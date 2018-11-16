package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders
  var domainName: java.lang.String
  var keepaliveTimeout: scala.Double
  var path: java.lang.String
  var port: scala.Double
  var protocol: awsDashLambdaLib.awsDashLambdaLibStrings.http | awsDashLambdaLib.awsDashLambdaLibStrings.https
  var readTimeout: scala.Double
  var sslProtocols: js.Array[java.lang.String]
}

