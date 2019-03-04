package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a collection of all rows of a table or spreadsheet.
  * @see com.sun.star.table.TableRow
  */
trait TableRows
  extends XTableRows
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess

object TableRows {
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
    insertByIndex: js.Function2[scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): TableRows = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, createEnumeration = createEnumeration, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex)
  
    __obj.asInstanceOf[TableRows]
  }
}

