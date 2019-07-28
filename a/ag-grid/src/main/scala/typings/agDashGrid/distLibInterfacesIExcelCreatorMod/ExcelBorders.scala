package typings.agDashGrid.distLibInterfacesIExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelBorders extends js.Object {
  var borderBottom: ExcelBorder
  var borderLeft: ExcelBorder
  var borderRight: ExcelBorder
  var borderTop: ExcelBorder
}

object ExcelBorders {
  @scala.inline
  def apply(
    borderBottom: ExcelBorder,
    borderLeft: ExcelBorder,
    borderRight: ExcelBorder,
    borderTop: ExcelBorder
  ): ExcelBorders = {
    val __obj = js.Dynamic.literal(borderBottom = borderBottom, borderLeft = borderLeft, borderRight = borderRight, borderTop = borderTop)
  
    __obj.asInstanceOf[ExcelBorders]
  }
}

