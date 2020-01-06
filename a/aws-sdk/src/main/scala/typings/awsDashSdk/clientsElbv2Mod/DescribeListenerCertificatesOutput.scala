package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenerCertificatesOutput extends js.Object {
  /**
    * Information about the certificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeListenerCertificatesOutput {
  @scala.inline
  def apply(Certificates: CertificateList = null, NextMarker: Marker = null): DescribeListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeListenerCertificatesOutput]
  }
}

