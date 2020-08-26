package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: Cell = js.native
  val Selected: Boolean = js.native
  val Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  def Merge(MergeTo: Cell): Unit = js.native
  def Select(): Unit = js.native
  def Split(NumRows: Double, NumColumns: Double): Unit = js.native
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
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerge(value: Cell => Unit): Self = this.set("Merge", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotCell_typekey(value: Cell): Self = this.set("PowerPoint.Cell_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("Selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: Shape): Self = this.set("Shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplit(value: (Double, Double) => Unit): Self = this.set("Split", js.Any.fromFunction2(value))
  }
  
}

