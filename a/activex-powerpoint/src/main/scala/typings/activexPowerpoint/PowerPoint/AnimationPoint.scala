package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPoint extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var Formula: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.AnimationPoint_typekey")
  var PowerPointDotAnimationPoint_typekey: AnimationPoint = js.native
  var Time: Double = js.native
  var Value: js.Any = js.native
  def Delete(): Unit = js.native
}

object AnimationPoint {
  @scala.inline
  def apply(
    Application: Application,
    Delete: () => Unit,
    Formula: String,
    Parent: js.Any,
    PowerPointDotAnimationPoint_typekey: AnimationPoint,
    Time: Double,
    Value: js.Any
  ): AnimationPoint = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Formula = Formula.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationPoint_typekey")(PowerPointDotAnimationPoint_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPoint]
  }
  @scala.inline
  implicit class AnimationPointOps[Self <: AnimationPoint] (val x: Self) extends AnyVal {
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
    def setFormula(value: String): Self = this.set("Formula", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotAnimationPoint_typekey(value: AnimationPoint): Self = this.set("PowerPoint.AnimationPoint_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("Time", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

