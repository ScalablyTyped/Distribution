package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationBehavior extends StObject {
  
  var Accumulate: MsoAnimAccumulate = js.native
  
  var Additive: MsoAnimAdditive = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val ColorEffect: typings.activexPowerpoint.PowerPoint.ColorEffect = js.native
  
  val CommandEffect: typings.activexPowerpoint.PowerPoint.CommandEffect = js.native
  
  def Delete(): Unit = js.native
  
  val FilterEffect: typings.activexPowerpoint.PowerPoint.FilterEffect = js.native
  
  val MotionEffect: typings.activexPowerpoint.PowerPoint.MotionEffect = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.AnimationBehavior_typekey")
  var PowerPointDotAnimationBehavior_typekey: AnimationBehavior = js.native
  
  val PropertyEffect: typings.activexPowerpoint.PowerPoint.PropertyEffect = js.native
  
  val RotationEffect: typings.activexPowerpoint.PowerPoint.RotationEffect = js.native
  
  val ScaleEffect: typings.activexPowerpoint.PowerPoint.ScaleEffect = js.native
  
  val SetEffect: typings.activexPowerpoint.PowerPoint.SetEffect = js.native
  
  val Timing: typings.activexPowerpoint.PowerPoint.Timing = js.native
  
  var Type: MsoAnimType = js.native
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
  
  @scala.inline
  implicit class AnimationBehaviorMutableBuilder[Self <: AnimationBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccumulate(value: MsoAnimAccumulate): Self = StObject.set(x, "Accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditive(value: MsoAnimAdditive): Self = StObject.set(x, "Additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorEffect(value: ColorEffect): Self = StObject.set(x, "ColorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandEffect(value: CommandEffect): Self = StObject.set(x, "CommandEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilterEffect(value: FilterEffect): Self = StObject.set(x, "FilterEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionEffect(value: MotionEffect): Self = StObject.set(x, "MotionEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAnimationBehavior_typekey(value: AnimationBehavior): Self = StObject.set(x, "PowerPoint.AnimationBehavior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyEffect(value: PropertyEffect): Self = StObject.set(x, "PropertyEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationEffect(value: RotationEffect): Self = StObject.set(x, "RotationEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEffect(value: ScaleEffect): Self = StObject.set(x, "ScaleEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEffect(value: SetEffect): Self = StObject.set(x, "SetEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: Timing): Self = StObject.set(x, "Timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoAnimType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
