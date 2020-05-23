package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellRange extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Borders: typings.activexPowerpoint.PowerPoint.Borders
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.CellRange_typekey")
  var PowerPointDotCellRange_typekey: CellRange
  def Item(Index: Double): Cell
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
}

