package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borders extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Borders_typekey")
  var PowerPointDotBorders_typekey: Borders = js.native
  def Item(BorderType: PpBorderType): LineFormat = js.native
}

object Borders {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpBorderType => LineFormat,
    Parent: js.Any,
    PowerPointDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Borders_typekey")(PowerPointDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  @scala.inline
  implicit class BordersOps[Self <: Borders] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: PpBorderType => LineFormat): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotBorders_typekey(value: Borders): Self = this.set("PowerPoint.Borders_typekey", value.asInstanceOf[js.Any])
  }
  
}

