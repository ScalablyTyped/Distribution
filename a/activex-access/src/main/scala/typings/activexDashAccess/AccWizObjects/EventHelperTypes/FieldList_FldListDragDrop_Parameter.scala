package typings.activexDashAccess.AccWizObjects.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldList_FldListDragDrop_Parameter extends js.Object {
  val SourceCtlName: String
  val SourceFieldList: Double
  val SourceRow: Double
  val TargetCtlName: String
  val TargetFieldList: Double
  val TargetRow: Double
}

object FieldList_FldListDragDrop_Parameter {
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    TargetCtlName: String,
    TargetFieldList: Double,
    TargetRow: Double
  ): FieldList_FldListDragDrop_Parameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName, SourceFieldList = SourceFieldList, SourceRow = SourceRow, TargetCtlName = TargetCtlName, TargetFieldList = TargetFieldList, TargetRow = TargetRow)
  
    __obj.asInstanceOf[FieldList_FldListDragDrop_Parameter]
  }
}

