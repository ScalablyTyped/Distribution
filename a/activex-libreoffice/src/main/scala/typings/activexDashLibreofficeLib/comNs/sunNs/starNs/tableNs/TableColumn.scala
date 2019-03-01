package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a special cell range containing all cells of a single specific column in a table or spreadsheet. */
trait TableColumn
  extends XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** is `TRUE` , if there is a manual horizontal page break attached to the column. */
  var IsStartOfNewPage: scala.Boolean
  /** is `TRUE` , if the column is visible. */
  var IsVisible: scala.Boolean
  /** is `TRUE` , if the column always keeps its optimal width. */
  var OptimalWidth: scala.Boolean
  /**
    * contains the width of the column (in 1/100th mm).
    *
    * When hidden, it returns the width which the column would have, if it were visible.
    */
  var Width: scala.Double
}

object TableColumn {
  @scala.inline
  def apply(
    IsStartOfNewPage: scala.Boolean,
    IsVisible: scala.Boolean,
    Name: java.lang.String,
    OptimalWidth: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Width: scala.Double,
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
    getName: js.Function0[java.lang.String],
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
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsStartOfNewPage")(IsStartOfNewPage)
    __obj.updateDynamic("IsVisible")(IsVisible)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("OptimalWidth")(OptimalWidth)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getCellByPosition")(getCellByPosition)
    __obj.updateDynamic("getCellRangeByName")(getCellRangeByName)
    __obj.updateDynamic("getCellRangeByPosition")(getCellRangeByPosition)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[TableColumn]
  }
}

