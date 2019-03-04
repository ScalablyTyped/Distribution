package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a collection of cell annotations.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait CellAnnotations
  extends XSheetAnnotations
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess

object CellAnnotations {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertNew: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      java.lang.String, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit]
  ): CellAnnotations = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, createEnumeration = createEnumeration, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, insertNew = insertNew, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex)
  
    __obj.asInstanceOf[CellAnnotations]
  }
}

