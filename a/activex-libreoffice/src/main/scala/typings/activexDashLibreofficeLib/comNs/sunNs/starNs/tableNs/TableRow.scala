package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a special cell range containing all cells of a single specific row in a table or spreadsheet. */
trait TableRow
  extends XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * contains the height of the row (in 1/100 mm).
    *
    * When hidden, it returns the height which the row would have, if it were visible.
    */
  var Height: scala.Double
  /** is `TRUE` , if there is a manual vertical page break attached to the row. */
  var IsStartOfNewPage: scala.Boolean
  /** is `TRUE` , if the row is visible. */
  var IsVisible: scala.Boolean
  /** is `TRUE` , if the row always keeps its optimal height. */
  var OptimalHeight: scala.Boolean
}

object TableRow {
  @scala.inline
  def apply(
    Height: scala.Double,
    IsStartOfNewPage: scala.Boolean,
    IsVisible: scala.Boolean,
    OptimalHeight: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getCellByPosition: js.Function2[scala.Double, scala.Double, XCell],
    getCellRangeByName: js.Function1[java.lang.String, XCellRange],
    getCellRangeByPosition: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, XCellRange],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TableRow = {
    val __obj = js.Dynamic.literal(Height = Height, IsStartOfNewPage = IsStartOfNewPage, IsVisible = IsVisible, OptimalHeight = OptimalHeight, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getCellByPosition = getCellByPosition, getCellRangeByName = getCellRangeByName, getCellRangeByPosition = getCellRangeByPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[TableRow]
  }
}

