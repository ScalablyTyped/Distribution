package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Cells: CellRange
  var Height: Double
  val Parent: js.Any
  @JSName("PowerPoint.Row_typekey")
  var PowerPointDotRow_typekey: Row
  def Delete(): Unit
  def Select(): Unit
}

object Row {
  @scala.inline
  def apply(
    Application: Application,
    Cells: CellRange,
    Delete: () => Unit,
    Height: Double,
    Parent: js.Any,
    PowerPointDotRow_typekey: Row,
    Select: () => Unit
  ): Row = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.Row_typekey")(PowerPointDotRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

