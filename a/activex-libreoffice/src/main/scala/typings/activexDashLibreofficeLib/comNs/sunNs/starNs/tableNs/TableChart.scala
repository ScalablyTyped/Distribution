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
    Ranges: activexDashInteropLib.SafeArray[CellRangeAddress],
    acquire: js.Function0[scala.Unit],
    getEmbeddedObject: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    getHasColumnHeaders: js.Function0[scala.Boolean],
    getHasRowHeaders: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getRanges: js.Function0[activexDashInteropLib.SafeArray[CellRangeAddress]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setHasColumnHeaders: js.Function1[scala.Boolean, scala.Unit],
    setHasRowHeaders: js.Function1[scala.Boolean, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setRanges: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress], scala.Unit]
  ): TableChart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EmbeddedObject")(EmbeddedObject)
    __obj.updateDynamic("HasColumnHeaders")(HasColumnHeaders)
    __obj.updateDynamic("HasRowHeaders")(HasRowHeaders)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Ranges")(Ranges)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getEmbeddedObject")(getEmbeddedObject)
    __obj.updateDynamic("getHasColumnHeaders")(getHasColumnHeaders)
    __obj.updateDynamic("getHasRowHeaders")(getHasRowHeaders)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getRanges")(getRanges)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setHasColumnHeaders")(setHasColumnHeaders)
    __obj.updateDynamic("setHasRowHeaders")(setHasRowHeaders)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setRanges")(setRanges)
    __obj.asInstanceOf[TableChart]
  }
}

