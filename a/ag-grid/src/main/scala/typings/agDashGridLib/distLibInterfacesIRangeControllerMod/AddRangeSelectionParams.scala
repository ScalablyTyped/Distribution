package typings
package agDashGridLib.distLibInterfacesIRangeControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRangeSelectionParams extends js.Object {
  var columnEnd: java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column
  var columnStart: java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column
  var floatingEnd: java.lang.String
  var floatingStart: java.lang.String
  var rowEnd: scala.Double
  var rowStart: scala.Double
}

object AddRangeSelectionParams {
  @scala.inline
  def apply(
    columnEnd: java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column,
    columnStart: java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column,
    floatingEnd: java.lang.String,
    floatingStart: java.lang.String,
    rowEnd: scala.Double,
    rowStart: scala.Double
  ): AddRangeSelectionParams = {
    val __obj = js.Dynamic.literal(columnEnd = columnEnd.asInstanceOf[js.Any], columnStart = columnStart.asInstanceOf[js.Any], floatingEnd = floatingEnd, floatingStart = floatingStart, rowEnd = rowEnd, rowStart = rowStart)
  
    __obj.asInstanceOf[AddRangeSelectionParams]
  }
}

