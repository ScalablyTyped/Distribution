package typings.agDashGrid.distLibInterfacesIRangeControllerMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRangeSelectionParams extends js.Object {
  var columnEnd: String | Column
  var columnStart: String | Column
  var floatingEnd: String
  var floatingStart: String
  var rowEnd: Double
  var rowStart: Double
}

object AddRangeSelectionParams {
  @scala.inline
  def apply(
    columnEnd: String | Column,
    columnStart: String | Column,
    floatingEnd: String,
    floatingStart: String,
    rowEnd: Double,
    rowStart: Double
  ): AddRangeSelectionParams = {
    val __obj = js.Dynamic.literal(columnEnd = columnEnd.asInstanceOf[js.Any], columnStart = columnStart.asInstanceOf[js.Any], floatingEnd = floatingEnd, floatingStart = floatingStart, rowEnd = rowEnd, rowStart = rowStart)
  
    __obj.asInstanceOf[AddRangeSelectionParams]
  }
}

