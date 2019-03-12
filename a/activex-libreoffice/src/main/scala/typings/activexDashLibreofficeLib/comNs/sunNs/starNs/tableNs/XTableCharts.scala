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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addNewByName: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress], scala.Boolean, scala.Boolean) => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit
  ): XTableCharts = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addNewByName = js.Any.fromFunction5(addNewByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
  
    __obj.asInstanceOf[XTableCharts]
  }
}

