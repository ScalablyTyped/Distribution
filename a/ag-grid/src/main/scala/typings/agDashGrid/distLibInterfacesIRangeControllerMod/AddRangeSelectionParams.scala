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
    val __obj = js.Dynamic.literal(columnEnd = columnEnd.asInstanceOf[js.Any], columnStart = columnStart.asInstanceOf[js.Any], floatingEnd = floatingEnd.asInstanceOf[js.Any], floatingStart = floatingStart.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any], rowStart = rowStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddRangeSelectionParams]
  }
}

