package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to manage a collection of database ranges.
  * @see com.sun.star.sheet.DatabaseRanges
  */
trait XDatabaseRanges
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** adds a new database range to the collection. */
  def addNewByName(
    aName: java.lang.String,
    aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  ): scala.Unit
  /** removes a database range from the collection. */
  def removeByName(aName: java.lang.String): scala.Unit
}

object XDatabaseRanges {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addNewByName: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
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
  ): XDatabaseRanges = {
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
    __obj.asInstanceOf[XDatabaseRanges]
  }
}

