package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val By: ColorFormat
  
  val From: ColorFormat
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ColorEffect_typekey")
  var PowerPointDotColorEffect_typekey: ColorEffect
  
  val To: ColorFormat
}
object ColorEffect {
  
  inline def apply(
    Application: Application,
    By: ColorFormat,
    From: ColorFormat,
    Parent: Any,
    PowerPointDotColorEffect_typekey: ColorEffect,
    To: ColorFormat
  ): ColorEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorEffect_typekey")(PowerPointDotColorEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorEffect] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBy(value: ColorFormat): Self = StObject.set(x, "By", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: ColorFormat): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotColorEffect_typekey(value: ColorEffect): Self = StObject.set(x, "PowerPoint.ColorEffect_typekey", value.asInstanceOf[js.Any])
    
    inline def setTo(value: ColorFormat): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
