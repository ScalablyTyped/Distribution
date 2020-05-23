package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Borders: typings.activexPowerpoint.PowerPoint.Borders
  val Parent: js.Any
  @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: Cell
  val Selected: Boolean
  val Shape: typings.activexPowerpoint.PowerPoint.Shape
  def Merge(MergeTo: Cell): Unit
  def Select(): Unit
  def Split(NumRows: Double, NumColumns: Double): Unit
}

object Cell {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Merge: Cell => Unit,
    Parent: js.Any,
    PowerPointDotCell_typekey: Cell,
    Select: () => Unit,
    Selected: Boolean,
    Shape: Shape,
    Split: (Double, Double) => Unit
  ): Cell = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Merge = js.Any.fromFunction1(Merge), Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Selected = Selected.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Split = js.Any.fromFunction2(Split))
    __obj.updateDynamic("PowerPoint.Cell_typekey")(PowerPointDotCell_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

