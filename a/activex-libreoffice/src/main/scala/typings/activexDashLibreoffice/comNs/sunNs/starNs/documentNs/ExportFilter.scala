package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
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
     with XInitialization
     with XNamed

object ExportFilter {
  @scala.inline
  def apply(
    Name: String,
    acquire: () => Unit,
    cancel: () => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getName: () => String,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setSourceDocument: XComponent => Unit
  ): ExportFilter = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
  
    __obj.asInstanceOf[ExportFilter]
  }
}

