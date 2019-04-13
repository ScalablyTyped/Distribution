package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificatesResponse extends js.Object {
  /**
    * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
  /**
    * The pagination token.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DescribeCertificatesResponse {
  @scala.inline
  def apply(Certificates: CertificateList = null, Marker: String = null): DescribeCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeCertificatesResponse]
  }
}

