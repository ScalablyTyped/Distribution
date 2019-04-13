package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeListenerCertificatesOutput extends js.Object {
  /**
    * Information about the certificates.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeListenerCertificatesOutput {
  @scala.inline
  def apply(Certificates: CertificateList = null, NextMarker: Marker = null): DescribeListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeListenerCertificatesOutput]
  }
}

