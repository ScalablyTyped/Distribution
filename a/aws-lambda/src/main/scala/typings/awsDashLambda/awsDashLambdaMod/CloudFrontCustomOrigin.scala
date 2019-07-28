package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.awsDashLambdaStrings.http
import typings.awsDashLambda.awsDashLambdaStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders
  var domainName: String
  var keepaliveTimeout: Double
  var path: String
  var port: Double
  var protocol: http | https
  var readTimeout: Double
  var sslProtocols: js.Array[String]
}

object CloudFrontCustomOrigin {
  @scala.inline
  def apply(
    customHeaders: CloudFrontHeaders,
    domainName: String,
    keepaliveTimeout: Double,
    path: String,
    port: Double,
    protocol: http | https,
    readTimeout: Double,
    sslProtocols: js.Array[String]
  ): CloudFrontCustomOrigin = {
    val __obj = js.Dynamic.literal(customHeaders = customHeaders, domainName = domainName, keepaliveTimeout = keepaliveTimeout, path = path, port = port, protocol = protocol.asInstanceOf[js.Any], readTimeout = readTimeout, sslProtocols = sslProtocols)
  
    __obj.asInstanceOf[CloudFrontCustomOrigin]
  }
}

