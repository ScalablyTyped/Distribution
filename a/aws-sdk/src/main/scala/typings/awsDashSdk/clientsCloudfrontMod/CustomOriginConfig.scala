package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomOriginConfig extends js.Object {
  /**
    * The HTTP port the custom origin listens on.
    */
  var HTTPPort: integer
  /**
    * The HTTPS port the custom origin listens on.
    */
  var HTTPSPort: integer
  /**
    * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1 second; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
    */
  var OriginKeepaliveTimeout: js.UndefOr[integer] = js.undefined
  /**
    * The origin protocol policy to apply to your origin.
    */
  var OriginProtocolPolicy: typings.awsDashSdk.clientsCloudfrontMod.OriginProtocolPolicy
  /**
    * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 4 seconds; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
    */
  var OriginReadTimeout: js.UndefOr[integer] = js.undefined
  /**
    * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
    */
  var OriginSslProtocols: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.OriginSslProtocols] = js.undefined
}

object CustomOriginConfig {
  @scala.inline
  def apply(
    HTTPPort: integer,
    HTTPSPort: integer,
    OriginProtocolPolicy: OriginProtocolPolicy,
    OriginKeepaliveTimeout: js.UndefOr[integer] = js.undefined,
    OriginReadTimeout: js.UndefOr[integer] = js.undefined,
    OriginSslProtocols: OriginSslProtocols = null
  ): CustomOriginConfig = {
    val __obj = js.Dynamic.literal(HTTPPort = HTTPPort, HTTPSPort = HTTPSPort, OriginProtocolPolicy = OriginProtocolPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(OriginKeepaliveTimeout)) __obj.updateDynamic("OriginKeepaliveTimeout")(OriginKeepaliveTimeout)
    if (!js.isUndefined(OriginReadTimeout)) __obj.updateDynamic("OriginReadTimeout")(OriginReadTimeout)
    if (OriginSslProtocols != null) __obj.updateDynamic("OriginSslProtocols")(OriginSslProtocols)
    __obj.asInstanceOf[CustomOriginConfig]
  }
}

