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

object CloudFrontCustomOrigin {
  @scala.inline
  def apply(
    customHeaders: CloudFrontHeaders,
    domainName: java.lang.String,
    keepaliveTimeout: scala.Double,
    path: java.lang.String,
    port: scala.Double,
    protocol: awsDashLambdaLib.awsDashLambdaLibStrings.http | awsDashLambdaLib.awsDashLambdaLibStrings.https,
    readTimeout: scala.Double,
    sslProtocols: js.Array[java.lang.String]
  ): CloudFrontCustomOrigin = {
    val __obj = js.Dynamic.literal(customHeaders = customHeaders, domainName = domainName, keepaliveTimeout = keepaliveTimeout, path = path, port = port, protocol = protocol.asInstanceOf[js.Any], readTimeout = readTimeout, sslProtocols = sslProtocols)
  
    __obj.asInstanceOf[CloudFrontCustomOrigin]
  }
}

