package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationBehavior extends js.Object {
  var Accumulate: MsoAnimAccumulate
  var Additive: MsoAnimAdditive
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val ColorEffect: typings.activexPowerpoint.PowerPoint.ColorEffect
  val CommandEffect: typings.activexPowerpoint.PowerPoint.CommandEffect
  val FilterEffect: typings.activexPowerpoint.PowerPoint.FilterEffect
  val MotionEffect: typings.activexPowerpoint.PowerPoint.MotionEffect
  val Parent: js.Any
  @JSName("PowerPoint.AnimationBehavior_typekey")
  var PowerPointDotAnimationBehavior_typekey: AnimationBehavior
  val PropertyEffect: typings.activexPowerpoint.PowerPoint.PropertyEffect
  val RotationEffect: typings.activexPowerpoint.PowerPoint.RotationEffect
  val ScaleEffect: typings.activexPowerpoint.PowerPoint.ScaleEffect
  val SetEffect: typings.activexPowerpoint.PowerPoint.SetEffect
  val Timing: typings.activexPowerpoint.PowerPoint.Timing
  var Type: MsoAnimType
  def Delete(): Unit
}

object AnimationBehavior {
  @scala.inline
  def apply(
    Accumulate: MsoAnimAccumulate,
    Additive: MsoAnimAdditive,
    Application: Application,
    ColorEffect: ColorEffect,
    CommandEffect: CommandEffect,
    Delete: () => Unit,
    FilterEffect: FilterEffect,
    MotionEffect: MotionEffect,
    Parent: js.Any,
    PowerPointDotAnimationBehavior_typekey: AnimationBehavior,
    PropertyEffect: PropertyEffect,
    RotationEffect: RotationEffect,
    ScaleEffect: ScaleEffect,
    SetEffect: SetEffect,
    Timing: Timing,
    Type: MsoAnimType
  ): AnimationBehavior = {
    val __obj = js.Dynamic.literal(Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ColorEffect = ColorEffect.asInstanceOf[js.Any], CommandEffect = CommandEffect.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), FilterEffect = FilterEffect.asInstanceOf[js.Any], MotionEffect = MotionEffect.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertyEffect = PropertyEffect.asInstanceOf[js.Any], RotationEffect = RotationEffect.asInstanceOf[js.Any], ScaleEffect = ScaleEffect.asInstanceOf[js.Any], SetEffect = SetEffect.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationBehavior_typekey")(PowerPointDotAnimationBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationBehavior]
  }
}

