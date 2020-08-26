package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintRange extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val End: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PrintRange_typekey")
  var PowerPointDotPrintRange_typekey: PrintRange = js.native
  val Start: Double = js.native
  def Delete(): Unit = js.native
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
  @scala.inline
  implicit class PrintRangeOps[Self <: PrintRange] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setEnd(value: Double): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotPrintRange_typekey(value: PrintRange): Self = this.set("PowerPoint.PrintRange_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("Start", value.asInstanceOf[js.Any])
  }
  
}

