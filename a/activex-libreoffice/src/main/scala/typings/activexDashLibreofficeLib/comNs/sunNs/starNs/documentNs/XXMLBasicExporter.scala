package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides unified interface for {@link XMLOasisBasicExporter} and {@link XMLBasicExporter} services.
  * @since LibreOffice 4.1
  */
trait XXMLBasicExporter
  extends XExporter
     with XFilter

object XXMLBasicExporter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setSourceDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit]
  ): XXMLBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire, cancel = cancel, filter = filter, queryInterface = queryInterface, release = release, setSourceDocument = setSourceDocument)
  
    __obj.asInstanceOf[XXMLBasicExporter]
  }
}

