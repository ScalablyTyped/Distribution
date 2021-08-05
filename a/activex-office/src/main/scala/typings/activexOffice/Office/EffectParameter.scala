package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectParameter extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val Name: String
  
  /* private */ @JSName("Office.EffectParameter_typekey")
  var OfficeDotEffectParameter_typekey: EffectParameter
  
  var Value: js.Any
}
object EffectParameter {
  
  inline def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    OfficeDotEffectParameter_typekey: EffectParameter,
    Value: js.Any
  ): EffectParameter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.EffectParameter_typekey")(OfficeDotEffectParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParameter]
  }
  
  extension [Self <: EffectParameter](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotEffectParameter_typekey(value: EffectParameter): Self = StObject.set(x, "Office.EffectParameter_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
