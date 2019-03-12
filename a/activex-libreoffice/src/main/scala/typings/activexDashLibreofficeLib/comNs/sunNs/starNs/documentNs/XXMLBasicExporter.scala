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
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setSourceDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent => scala.Unit
  ): XXMLBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
  
    __obj.asInstanceOf[XXMLBasicExporter]
  }
}

