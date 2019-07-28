package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCertificateMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted certificate.
    */
  var CertificateArn: String
}

object DeleteCertificateMessage {
  @scala.inline
  def apply(CertificateArn: String): DeleteCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn)
  
    __obj.asInstanceOf[DeleteCertificateMessage]
  }
}

