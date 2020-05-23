package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdCertificateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.CertificateObject")
@js.native
class CertificateObject protected ()
  extends typings.activexInfopath.InfoPath.CertificateObject {
  /* CompleteClass */
  override val ExpirationDate: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.CertificateObject_typekey")
  override var InfoPathDotCertificateObject_typekey: typings.activexInfopath.InfoPath.CertificateObject = js.native
  /* CompleteClass */
  override val IssuedBy: String = js.native
  /* CompleteClass */
  override val IssuedTo: String = js.native
  /* CompleteClass */
  override val Status: XdCertificateStatus = js.native
}

