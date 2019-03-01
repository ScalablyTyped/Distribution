package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access charts via name and to insert and remove charts.
  * @see com.sun.star.table.TableCharts
  */
trait XTableCharts
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * creates a chart and adds it to the collection.
    * @param aName is the name of the chart. This name is used to reference the chart in the collection.
    * @param aRect contains the rectangular location of the chart within the table (in 1/100th mm).
    * @param aRanges all cell ranges containing the source data of the chart.
    * @param bColumnHeaders if set to `TRUE` , the topmost row of the source data will be used to set labels for the category axis or the legend.
    * @param bRowHeaders if set to `TRUE` , the leftmost column of the source data will be used to set labels for the category axis or the legend.
    */
  def addNewByName(
    aName: java.lang.String,
    aRect: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    aRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress],
    bColumnHeaders: scala.Boolean,
    bRowHeaders: scala.Boolean
  ): scala.Unit
  /**
    * removes a chart from the collection.
    * @param aName is the name of the chart to remove.
    */
  def removeByName(aName: java.lang.String): scala.Unit
}

object XTableCharts {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addNewByName: js.Function5[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress], 
      scala.Boolean, 
      scala.Boolean, 
      scala.Unit
    ],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit]
  ): XTableCharts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addNewByName")(addNewByName)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.asInstanceOf[XTableCharts]
  }
}

