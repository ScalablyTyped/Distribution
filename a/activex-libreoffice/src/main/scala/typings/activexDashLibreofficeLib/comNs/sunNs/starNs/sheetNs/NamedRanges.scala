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
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, addActionLock = addActionLock, addNewByName = addNewByName, addNewFromTitles = addNewFromTitles, createEnumeration = createEnumeration, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, isActionLocked = isActionLocked, outputList = outputList, queryInterface = queryInterface, release = release, removeActionLock = removeActionLock, removeByName = removeByName, resetActionLocks = resetActionLocks, setActionLocks = setActionLocks)
  
    __obj.asInstanceOf[NamedRanges]
  }
}

