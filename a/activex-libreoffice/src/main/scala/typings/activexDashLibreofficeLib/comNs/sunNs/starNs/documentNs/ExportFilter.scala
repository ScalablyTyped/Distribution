package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * filter for exports
  *
  * Such filters can be used for exporting a content. Of course it's possible to combine it with the service {@link ImportFilter} if import functionality
  * should be available at same implementation too.
  * @see ImportFilter
  */
trait ExportFilter
  extends XExporter
     with XFilter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object ExportFilter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Boolean,
    getName: () => java.lang.String,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setSourceDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent => scala.Unit
  ): ExportFilter = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
  
    __obj.asInstanceOf[ExportFilter]
  }
}

