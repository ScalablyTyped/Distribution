package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShapeGroup
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShapeGrouper
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShapes
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
  extends XShapes
     with XShapeGrouper

object SpreadsheetDrawPage {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    add: XShape => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    group: XShapes => XShapeGroup,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XShape => Unit,
    ungroup: XShapeGroup => Unit
  ): SpreadsheetDrawPage = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[SpreadsheetDrawPage]
  }
}

