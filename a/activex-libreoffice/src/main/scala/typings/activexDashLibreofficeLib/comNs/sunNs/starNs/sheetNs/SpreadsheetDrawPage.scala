package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This abstract service is implemented by every page of a {@link SpreadsheetDocument} .
  *
  * Example: create and insert a couple of com::sun::star::drawing::LineShapes:
  *
  * {{program example here, see documentation}}
  * @since OOo 1.1.2
  */
trait SpreadsheetDrawPage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGrouper

object SpreadsheetDrawPage {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    add: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    group: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape => scala.Unit,
    ungroup: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup => scala.Unit
  ): SpreadsheetDrawPage = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[SpreadsheetDrawPage]
  }
}

