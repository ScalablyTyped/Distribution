package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adjustments extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Adjustments_typekey")
  var PowerPointDotAdjustments_typekey: Adjustments = js.native
  def Item(Index: Double): Double = js.native
}

object Adjustments {
  @scala.inline
  def apply(
    Application: js.Any,
    Count: Double,
    Creator: Double,
    Item: Double => Double,
    Parent: js.Any,
    PowerPointDotAdjustments_typekey: Adjustments
  ): Adjustments = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Adjustments_typekey")(PowerPointDotAdjustments_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adjustments]
  }
  @scala.inline
  implicit class AdjustmentsOps[Self <: Adjustments] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => Double): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotAdjustments_typekey(value: Adjustments): Self = this.set("PowerPoint.Adjustments_typekey", value.asInstanceOf[js.Any])
  }
  
}

