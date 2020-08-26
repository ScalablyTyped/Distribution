package typings.awsLambda.cloudfrontMod

import typings.awsLambda.awsLambdaStrings.http
import typings.awsLambda.awsLambdaStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontCustomOrigin extends js.Object {
  var customHeaders: CloudFrontHeaders = js.native
  var domainName: String = js.native
  var keepaliveTimeout: Double = js.native
  var path: String = js.native
  var port: Double = js.native
  var protocol: http | https = js.native
  var readTimeout: Double = js.native
  var sslProtocols: js.Array[String] = js.native
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
  @scala.inline
  implicit class CloudFrontCustomOriginOps[Self <: CloudFrontCustomOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomHeaders(value: CloudFrontHeaders): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepaliveTimeout(value: Double): Self = this.set("keepaliveTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadTimeout(value: Double): Self = this.set("readTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSslProtocolsVarargs(value: String*): Self = this.set("sslProtocols", js.Array(value :_*))
    @scala.inline
    def setSslProtocols(value: js.Array[String]): Self = this.set("sslProtocols", value.asInstanceOf[js.Any])
  }
  
}

