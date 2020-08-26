package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Cells: CellRange = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Column_typekey")
  var PowerPointDotColumn_typekey: Column = js.native
  var Width: Double = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
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
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
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
    def setCells(value: CellRange): Self = this.set("Cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotColumn_typekey(value: Column): Self = this.set("PowerPoint.Column_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

