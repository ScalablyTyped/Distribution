package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellRange extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CellRange_typekey")
  var PowerPointDotCellRange_typekey: CellRange = js.native
  def Item(Index: Double): Cell = js.native
}

object CellRange {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Count: Double,
    Item: Double => Cell,
    Parent: js.Any,
    PowerPointDotCellRange_typekey: CellRange
  ): CellRange = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CellRange_typekey")(PowerPointDotCellRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRange]
  }
  @scala.inline
  implicit class CellRangeOps[Self <: CellRange] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => Cell): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotCellRange_typekey(value: CellRange): Self = this.set("PowerPoint.CellRange_typekey", value.asInstanceOf[js.Any])
  }
  
}

