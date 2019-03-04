package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information regarding which MIME types are supported by a filter. */
trait XMimeTypeInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence of the names of all supported MIME types. */
  val SupportedMimeTypeNames: activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns a sequence of the names of all supported MIME types. */
  def getSupportedMimeTypeNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /** asks whether a MIME type is supported or not. */
  def supportsMimeType(MimeTypeName: java.lang.String): scala.Boolean
}

object XMimeTypeInfo {
  @scala.inline
  def apply(
    SupportedMimeTypeNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getSupportedMimeTypeNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsMimeType: js.Function1[java.lang.String, scala.Boolean]
  ): XMimeTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames, acquire = acquire, getSupportedMimeTypeNames = getSupportedMimeTypeNames, queryInterface = queryInterface, release = release, supportsMimeType = supportsMimeType)
  
    __obj.asInstanceOf[XMimeTypeInfo]
  }
}

