package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEmbeddedObjectSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a chart based on data in a table or spreadsheet.
  *
  * This service does not represent the chart document model itself, but the object in the table that contains this chart document.
  */
trait TableChart
  extends XTableChart
     with XEmbeddedObjectSupplier
     with XNamed

object TableChart {
  @scala.inline
  def apply(
    EmbeddedObject: XComponent,
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Name: String,
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    getHasColumnHeaders: () => Boolean,
    getHasRowHeaders: () => Boolean,
    getName: () => String,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHasColumnHeaders: Boolean => Unit,
    setHasRowHeaders: Boolean => Unit,
    setName: String => Unit,
    setRanges: SeqEquiv[CellRangeAddress] => Unit
  ): TableChart = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject, HasColumnHeaders = HasColumnHeaders, HasRowHeaders = HasRowHeaders, Name = Name, Ranges = Ranges, acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getName = js.Any.fromFunction0(getName), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setName = js.Any.fromFunction1(setName), setRanges = js.Any.fromFunction1(setRanges))
  
    __obj.asInstanceOf[TableChart]
  }
}

