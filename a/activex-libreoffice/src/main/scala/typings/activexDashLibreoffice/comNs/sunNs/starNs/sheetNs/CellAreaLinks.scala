package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a collection of area links.
  * @see com.sun.star.sheet.CellAreaLink
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait CellAreaLinks
  extends XAreaLinks
     with XEnumerationAccess

object CellAreaLinks {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertAtPosition: (CellAddress, String, String, String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): CellAreaLinks = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertAtPosition = js.Any.fromFunction5(insertAtPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
  
    __obj.asInstanceOf[CellAreaLinks]
  }
}

