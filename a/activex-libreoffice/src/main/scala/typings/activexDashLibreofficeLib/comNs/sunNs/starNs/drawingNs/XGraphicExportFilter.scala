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
    SupportedMimeTypeNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    getSupportedMimeTypeNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setSourceDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit],
    supportsMimeType: js.Function1[java.lang.String, scala.Boolean]
  ): XGraphicExportFilter = {
    val __obj = js.Dynamic.literal(SupportedMimeTypeNames = SupportedMimeTypeNames, acquire = acquire, cancel = cancel, filter = filter, getSupportedMimeTypeNames = getSupportedMimeTypeNames, queryInterface = queryInterface, release = release, setSourceDocument = setSourceDocument, supportsMimeType = supportsMimeType)
  
    __obj.asInstanceOf[XGraphicExportFilter]
  }
}

