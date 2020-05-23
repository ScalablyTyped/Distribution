package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateObject extends js.Object {
  val ExpirationDate: String
  @JSName("InfoPath.CertificateObject_typekey")
  var InfoPathDotCertificateObject_typekey: CertificateObject
  val IssuedBy: String
  val IssuedTo: String
  val Status: XdCertificateStatus
}

object CertificateObject {
  @scala.inline
  def apply(
    ExpirationDate: String,
    InfoPathDotCertificateObject_typekey: CertificateObject,
    IssuedBy: String,
    IssuedTo: String,
    Status: XdCertificateStatus
  ): CertificateObject = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], IssuedBy = IssuedBy.asInstanceOf[js.Any], IssuedTo = IssuedTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.CertificateObject_typekey")(InfoPathDotCertificateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateObject]
  }
}

