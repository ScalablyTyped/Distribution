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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.updateDynamic("domainName")(domainName)
    __obj.updateDynamic("keepaliveTimeout")(keepaliveTimeout)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("readTimeout")(readTimeout)
    __obj.updateDynamic("sslProtocols")(sslProtocols)
    __obj.asInstanceOf[CloudFrontCustomOrigin]
  }
}

