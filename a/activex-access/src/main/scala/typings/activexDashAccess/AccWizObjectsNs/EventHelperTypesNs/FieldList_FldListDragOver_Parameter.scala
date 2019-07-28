package typings.activexDashAccess.AccWizObjectsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldList_FldListDragOver_Parameter extends js.Object {
  val SourceCtlName: String
  val SourceFieldList: Double
  val SourceRow: Double
  val State: Double
  val TargetCtlName: String
  val TargetFieldList: Double
  val TargetRow: Double
}

object FieldList_FldListDragOver_Parameter {
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    State: Double,
    TargetCtlName: String,
    TargetFieldList: Double,
    TargetRow: Double
  ): FieldList_FldListDragOver_Parameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName, SourceFieldList = SourceFieldList, SourceRow = SourceRow, State = State, TargetCtlName = TargetCtlName, TargetFieldList = TargetFieldList, TargetRow = TargetRow)
  
    __obj.asInstanceOf[FieldList_FldListDragOver_Parameter]
  }
}

