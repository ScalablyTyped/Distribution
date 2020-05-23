package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Cells: CellRange
  val Parent: js.Any
  @JSName("PowerPoint.Column_typekey")
  var PowerPointDotColumn_typekey: Column
  var Width: Double
  def Delete(): Unit
  def Select(): Unit
}

object Column {
  @scala.inline
  def apply(
    Application: Application,
    Cells: CellRange,
    Delete: () => Unit,
    Parent: js.Any,
    PowerPointDotColumn_typekey: Column,
    Select: () => Unit,
    Width: Double
  ): Column = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Column_typekey")(PowerPointDotColumn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

