package typings.appBuilderLib.windowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateFromStoreInfo extends js.Object {
  var isLocalMachineStore: Boolean
  var store: String
  var subject: String
  var thumbprint: String
}

object CertificateFromStoreInfo {
  @scala.inline
  def apply(isLocalMachineStore: Boolean, store: String, subject: String, thumbprint: String): CertificateFromStoreInfo = {
    val __obj = js.Dynamic.literal(isLocalMachineStore = isLocalMachineStore.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateFromStoreInfo]
  }
}

