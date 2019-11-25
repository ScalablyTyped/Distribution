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
    val __obj = js.Dynamic.literal(customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], keepaliveTimeout = keepaliveTimeout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], readTimeout = readTimeout.asInstanceOf[js.Any], sslProtocols = sslProtocols.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontCustomOrigin]
  }
}

