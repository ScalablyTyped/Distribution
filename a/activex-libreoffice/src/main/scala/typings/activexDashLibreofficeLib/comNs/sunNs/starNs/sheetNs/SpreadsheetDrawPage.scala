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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("ungroup")(ungroup)
    __obj.asInstanceOf[SpreadsheetDrawPage]
  }
}

