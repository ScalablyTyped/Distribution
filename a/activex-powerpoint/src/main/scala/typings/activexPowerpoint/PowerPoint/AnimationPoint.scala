package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPoint extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Formula: String
  val Parent: js.Any
  @JSName("PowerPoint.AnimationPoint_typekey")
  var PowerPointDotAnimationPoint_typekey: AnimationPoint
  var Time: Double
  var Value: js.Any
  def Delete(): Unit
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
}

