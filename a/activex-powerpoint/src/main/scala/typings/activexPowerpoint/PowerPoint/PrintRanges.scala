package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintRanges extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.PrintRanges_typekey")
  var PowerPointDotPrintRanges_typekey: PrintRanges
  def Add(Start: Double, End: Double): PrintRange
  def ClearAll(): Unit
  def Item(Index: Double): PrintRange
}

object PrintRanges {
  @scala.inline
  def apply(
    Add: (Double, Double) => PrintRange,
    Application: Application,
    ClearAll: () => Unit,
    Count: Double,
    Item: Double => PrintRange,
    Parent: js.Any,
    PowerPointDotPrintRanges_typekey: PrintRanges
  ): PrintRanges = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintRanges_typekey")(PowerPointDotPrintRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintRanges]
  }
}

