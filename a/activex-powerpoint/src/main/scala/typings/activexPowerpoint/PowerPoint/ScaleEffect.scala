package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var ByX: Double = js.native
  
  var ByY: Double = js.native
  
  var FromX: Double = js.native
  
  var FromY: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ScaleEffect_typekey")
  var PowerPointDotScaleEffect_typekey: ScaleEffect = js.native
  
  var ToX: Double = js.native
  
  var ToY: Double = js.native
}
object ScaleEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    ByX: Double,
    ByY: Double,
    FromX: Double,
    FromY: Double,
    Parent: js.Any,
    PowerPointDotScaleEffect_typekey: ScaleEffect,
    ToX: Double,
    ToY: Double
  ): ScaleEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ByX = ByX.asInstanceOf[js.Any], ByY = ByY.asInstanceOf[js.Any], FromX = FromX.asInstanceOf[js.Any], FromY = FromY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ToX = ToX.asInstanceOf[js.Any], ToY = ToY.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ScaleEffect_typekey")(PowerPointDotScaleEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEffect]
  }
  
  @scala.inline
  implicit class ScaleEffectMutableBuilder[Self <: ScaleEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByX(value: Double): Self = StObject.set(x, "ByX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByY(value: Double): Self = StObject.set(x, "ByY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromX(value: Double): Self = StObject.set(x, "FromX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromY(value: Double): Self = StObject.set(x, "FromY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotScaleEffect_typekey(value: ScaleEffect): Self = StObject.set(x, "PowerPoint.ScaleEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToX(value: Double): Self = StObject.set(x, "ToX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToY(value: Double): Self = StObject.set(x, "ToY", value.asInstanceOf[js.Any])
  }
}
