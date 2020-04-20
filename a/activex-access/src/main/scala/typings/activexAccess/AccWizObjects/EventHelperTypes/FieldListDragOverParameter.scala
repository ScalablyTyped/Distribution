package typings.activexAccess.AccWizObjects.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldListDragOverParameter extends js.Object {
  val SourceCtlName: String
  val SourceFieldList: Double
  val SourceRow: Double
  val State: Double
  val X: Double
  val Y: Double
}

object FieldListDragOverParameter {
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    State: Double,
    X: Double,
    Y: Double
  ): FieldListDragOverParameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListDragOverParameter]
  }
}

