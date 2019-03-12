package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides information regarding which MIME types are supported by a filter. */
trait XMimeTypeInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a sequence of the names of all supported MIME types. */
  val SupportedMimeTypeNames: stdLib.SafeArray[java.lang.String]
  /** @returns a sequence of the names of all supported MIME types. */
  def getSupportedMimeTypeNames(): stdLib.SafeArray[java.lang.String]
  /** asks whether a MIME type is supported or not. */
  def supportsMimeType(MimeTypeName: java.lang.String): scala.Boolean
}

object XMimeTypeInfo {
  @scala.inline
  def apply(
    SupportedMimeTypeNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getSupportedMimeTypeNames: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    supportsMimeType: java.lang.String => scala.Boolean
  ): XMimeTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames, acquire = js.Any.fromFunction0(acquire), getSupportedMimeTypeNames = js.Any.fromFunction0(getSupportedMimeTypeNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsMimeType = js.Any.fromFunction1(supportsMimeType))
  
    __obj.asInstanceOf[XMimeTypeInfo]
  }
}

