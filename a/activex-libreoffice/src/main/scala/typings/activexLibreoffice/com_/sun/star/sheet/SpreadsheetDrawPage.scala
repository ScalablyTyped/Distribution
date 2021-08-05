package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.drawing.XShapeGroup
import typings.activexLibreoffice.com_.sun.star.drawing.XShapeGrouper
import typings.activexLibreoffice.com_.sun.star.drawing.XShapes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service is implemented by every page of a {@link SpreadsheetDocument} .
  *
  * Example: create and insert a couple of com::sun::star::drawing::LineShapes:
  *
  * {{program example here, see documentation}}
  * @since OOo 1.1.2
  */
trait SpreadsheetDrawPage
  extends StObject
     with XShapes
     with XShapeGrouper
object SpreadsheetDrawPage {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction1(add), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), group = js.Any.fromFunction1(group), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), ungroup = js.Any.fromFunction1(ungroup))
    __obj.asInstanceOf[SpreadsheetDrawPage]
  }
}
