package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateFromStoreInfo extends js.Object {
  var isLocalMachineStore: scala.Boolean
  var store: java.lang.String
  var subject: java.lang.String
  var thumbprint: java.lang.String
}

object CertificateFromStoreInfo {
  @scala.inline
  def apply(
    isLocalMachineStore: scala.Boolean,
    store: java.lang.String,
    subject: java.lang.String,
    thumbprint: java.lang.String
  ): CertificateFromStoreInfo = {
    val __obj = js.Dynamic.literal(isLocalMachineStore = isLocalMachineStore, store = store, subject = subject, thumbprint = thumbprint)
  
    __obj.asInstanceOf[CertificateFromStoreInfo]
  }
}

