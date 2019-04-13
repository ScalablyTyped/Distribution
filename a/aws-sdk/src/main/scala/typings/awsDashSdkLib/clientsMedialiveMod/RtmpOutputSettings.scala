package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RtmpOutputSettings extends js.Object {
  /**
    * If set to verifyAuthenticity, verify the tls certificate chain to a trusted Certificate Authority (CA).  This will cause rtmps outputs with self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.undefined
  /**
    * Number of seconds to wait before retrying a connection to the Flash Media server if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[__integerMin1] = js.undefined
  /**
    * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname). For connection to Akamai, a username and password must be supplied. URI fields accept format identifiers.
    */
  var Destination: OutputLocationRef
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[__integerMin0] = js.undefined
}

object RtmpOutputSettings {
  @scala.inline
  def apply(
    Destination: OutputLocationRef,
    CertificateMode: RtmpOutputCertificateMode = null,
    ConnectionRetryInterval: js.UndefOr[__integerMin1] = js.undefined,
    NumRetries: js.UndefOr[__integerMin0] = js.undefined
  ): RtmpOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination)
    if (CertificateMode != null) __obj.updateDynamic("CertificateMode")(CertificateMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectionRetryInterval)) __obj.updateDynamic("ConnectionRetryInterval")(ConnectionRetryInterval)
    if (!js.isUndefined(NumRetries)) __obj.updateDynamic("NumRetries")(NumRetries)
    __obj.asInstanceOf[RtmpOutputSettings]
  }
}

