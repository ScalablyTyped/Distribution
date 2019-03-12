package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEmbeddedObjectSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object TableChart {
  @scala.inline
  def apply(
    EmbeddedObject: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    HasColumnHeaders: scala.Boolean,
    HasRowHeaders: scala.Boolean,
    Name: java.lang.String,
    Ranges: stdLib.SafeArray[CellRangeAddress],
    acquire: () => scala.Unit,
    getEmbeddedObject: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    getHasColumnHeaders: () => scala.Boolean,
    getHasRowHeaders: () => scala.Boolean,
    getName: () => java.lang.String,
    getRanges: () => stdLib.SafeArray[CellRangeAddress],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setHasColumnHeaders: scala.Boolean => scala.Unit,
    setHasRowHeaders: scala.Boolean => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress] => scala.Unit
  ): TableChart = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject, HasColumnHeaders = HasColumnHeaders, HasRowHeaders = HasRowHeaders, Name = Name, Ranges = Ranges, acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getName = js.Any.fromFunction0(getName), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setName = js.Any.fromFunction1(setName), setRanges = js.Any.fromFunction1(setRanges))
  
    __obj.asInstanceOf[TableChart]
  }
}

