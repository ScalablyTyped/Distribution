package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XGraphicExportFilter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XFilter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XExporter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XMimeTypeInfo

object XGraphicExportFilter {
  @scala.inline
  def apply(
    SupportedMimeTypeNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    getSupportedMimeTypeNames: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setSourceDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent => scala.Unit,
    supportsMimeType: java.lang.String => scala.Boolean
  ): XGraphicExportFilter = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames, acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), getSupportedMimeTypeNames = js.Any.fromFunction0(getSupportedMimeTypeNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument), supportsMimeType = js.Any.fromFunction1(supportsMimeType))
  
    __obj.asInstanceOf[XGraphicExportFilter]
  }
}

