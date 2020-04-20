package typings.activexAccess.AccWizObjects.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldListFldListDragOverParameter extends js.Object {
  val SourceCtlName: String
  val SourceFieldList: Double
  val SourceRow: Double
  val State: Double
  val TargetCtlName: String
  val TargetFieldList: Double
  val TargetRow: Double
}

object FieldListFldListDragOverParameter {
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    State: Double,
    TargetCtlName: String,
    TargetFieldList: Double,
    TargetRow: Double
  ): FieldListFldListDragOverParameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListFldListDragOverParameter]
  }
}

