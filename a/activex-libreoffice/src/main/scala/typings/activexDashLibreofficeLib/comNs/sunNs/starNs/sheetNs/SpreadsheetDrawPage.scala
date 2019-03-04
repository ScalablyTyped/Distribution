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
    acquire: js.Function0[scala.Unit],
    add: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    group: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapes, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup
    ],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Unit],
    ungroup: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup, scala.Unit]
  ): SpreadsheetDrawPage = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, add = add, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, group = group, hasElements = hasElements, queryInterface = queryInterface, release = release, remove = remove, ungroup = ungroup)
  
    __obj.asInstanceOf[SpreadsheetDrawPage]
  }
}

