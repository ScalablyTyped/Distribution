package typings
package activexDashAccessLib.AccWizObjectsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldList_FldListDragOver_Parameter extends js.Object {
  val SourceCtlName: java.lang.String
  val SourceFieldList: scala.Double
  val SourceRow: scala.Double
  val State: scala.Double
  val TargetCtlName: java.lang.String
  val TargetFieldList: scala.Double
  val TargetRow: scala.Double
}

object FieldList_FldListDragOver_Parameter {
  @scala.inline
  def apply(
    SourceCtlName: java.lang.String,
    SourceFieldList: scala.Double,
    SourceRow: scala.Double,
    State: scala.Double,
    TargetCtlName: java.lang.String,
    TargetFieldList: scala.Double,
    TargetRow: scala.Double
  ): FieldList_FldListDragOver_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SourceCtlName")(SourceCtlName)
    __obj.updateDynamic("SourceFieldList")(SourceFieldList)
    __obj.updateDynamic("SourceRow")(SourceRow)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("TargetCtlName")(TargetCtlName)
    __obj.updateDynamic("TargetFieldList")(TargetFieldList)
    __obj.updateDynamic("TargetRow")(TargetRow)
    __obj.asInstanceOf[FieldList_FldListDragOver_Parameter]
  }
}

