package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintRange extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val End: Double
  val Parent: js.Any
  @JSName("PowerPoint.PrintRange_typekey")
  var PowerPointDotPrintRange_typekey: PrintRange
  val Start: Double
  def Delete(): Unit
}

object PrintRange {
  @scala.inline
  def apply(
    Application: Application,
    Delete: () => Unit,
    End: Double,
    Parent: js.Any,
    PowerPointDotPrintRange_typekey: PrintRange,
    Start: Double
  ): PrintRange = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), End = End.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintRange_typekey")(PowerPointDotPrintRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintRange]
  }
}

