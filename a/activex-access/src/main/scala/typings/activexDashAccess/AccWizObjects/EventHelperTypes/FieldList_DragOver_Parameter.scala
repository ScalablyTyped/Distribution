package typings.activexDashAccess.AccWizObjects.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldList_DragOver_Parameter extends js.Object {
  val SourceCtlName: String
  val SourceFieldList: Double
  val SourceRow: Double
  val State: Double
  val X: Double
  val Y: Double
}

object FieldList_DragOver_Parameter {
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    State: Double,
    X: Double,
    Y: Double
  ): FieldList_DragOver_Parameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName, SourceFieldList = SourceFieldList, SourceRow = SourceRow, State = State, X = X, Y = Y)
  
    __obj.asInstanceOf[FieldList_DragOver_Parameter]
  }
}

