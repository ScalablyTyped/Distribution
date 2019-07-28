package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XExporter
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XFilter
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XMimeTypeInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XGraphicExportFilter
  extends XFilter
     with XExporter
     with XMimeTypeInfo

object XGraphicExportFilter {
  @scala.inline
  def apply(
    SupportedMimeTypeNames: SafeArray[String],
    acquire: () => Unit,
    cancel: () => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getSupportedMimeTypeNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSourceDocument: XComponent => Unit,
    supportsMimeType: String => Boolean
  ): XGraphicExportFilter = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames, acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), getSupportedMimeTypeNames = js.Any.fromFunction0(getSupportedMimeTypeNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument), supportsMimeType = js.Any.fromFunction1(supportsMimeType))
  
    __obj.asInstanceOf[XGraphicExportFilter]
  }
}

