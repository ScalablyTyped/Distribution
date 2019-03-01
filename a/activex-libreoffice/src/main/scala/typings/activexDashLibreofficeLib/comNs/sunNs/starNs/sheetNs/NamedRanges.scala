package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a collection of named ranges in a spreadsheet document.
  *
  * In fact a named range is a named formula expression. A cell range address is one possible content of a named range.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait NamedRanges
  extends XNamedRanges
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XActionLockable

object NamedRanges {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addActionLock: js.Function0[scala.Unit],
    addNewByName: js.Function4[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      scala.Double, 
      scala.Unit
    ],
    addNewFromTitles: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      Border, 
      scala.Unit
    ],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    isActionLocked: js.Function0[scala.Boolean],
    outputList: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActionLock: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    resetActionLocks: js.Function0[scala.Double],
    setActionLocks: js.Function1[scala.Double, scala.Unit]
  ): NamedRanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addActionLock")(addActionLock)
    __obj.updateDynamic("addNewByName")(addNewByName)
    __obj.updateDynamic("addNewFromTitles")(addNewFromTitles)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isActionLocked")(isActionLocked)
    __obj.updateDynamic("outputList")(outputList)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeActionLock")(removeActionLock)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.updateDynamic("resetActionLocks")(resetActionLocks)
    __obj.updateDynamic("setActionLocks")(setActionLocks)
    __obj.asInstanceOf[NamedRanges]
  }
}

