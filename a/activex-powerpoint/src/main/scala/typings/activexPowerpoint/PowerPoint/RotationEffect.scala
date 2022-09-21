package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var By: Double
  
  var From: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.RotationEffect_typekey")
  var PowerPointDotRotationEffect_typekey: RotationEffect
  
  var To: Double
}
object RotationEffect {
  
  inline def apply(
    Application: Application,
    By: Double,
    From: Double,
    Parent: Any,
    PowerPointDotRotationEffect_typekey: RotationEffect,
    To: Double
  ): RotationEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RotationEffect_typekey")(PowerPointDotRotationEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationEffect]
  }
  
  extension [Self <: RotationEffect](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBy(value: Double): Self = StObject.set(x, "By", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Double): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotRotationEffect_typekey(value: RotationEffect): Self = StObject.set(x, "PowerPoint.RotationEffect_typekey", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
