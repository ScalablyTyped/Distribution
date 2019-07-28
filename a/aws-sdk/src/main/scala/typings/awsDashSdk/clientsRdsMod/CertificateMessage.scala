package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateMessage extends js.Object {
  /**
    * The list of Certificate objects for the AWS account.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeCertificates request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object CertificateMessage {
  @scala.inline
  def apply(Certificates: CertificateList = null, Marker: String = null): CertificateMessage = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[CertificateMessage]
  }
}

