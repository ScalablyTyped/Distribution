package typings
package activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldList_DragOver_Parameter extends js.Object {
  val SourceCtlName: java.lang.String
  val SourceFieldList: scala.Double
  val SourceRow: scala.Double
  val State: scala.Double
  val X: scala.Double
  val Y: scala.Double
}

object FieldList_DragOver_Parameter {
  @scala.inline
  def apply(
    SourceCtlName: java.lang.String,
    SourceFieldList: scala.Double,
    SourceRow: scala.Double,
    State: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): FieldList_DragOver_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SourceCtlName")(SourceCtlName)
    __obj.updateDynamic("SourceFieldList")(SourceFieldList)
    __obj.updateDynamic("SourceRow")(SourceRow)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[FieldList_DragOver_Parameter]
  }
}

