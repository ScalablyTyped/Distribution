package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPoint extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def Delete(): Unit
  
  var Formula: String
  
  val Parent: js.Any
  
  @JSName("PowerPoint.AnimationPoint_typekey")
  var PowerPointDotAnimationPoint_typekey: AnimationPoint
  
  var Time: Double
  
  var Value: js.Any
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
  implicit class AnimationPointMutableBuilder[Self <: AnimationPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAnimationPoint_typekey(value: AnimationPoint): Self = StObject.set(x, "PowerPoint.AnimationPoint_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
