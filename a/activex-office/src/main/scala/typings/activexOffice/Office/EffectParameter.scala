package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectParameter extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Name: String = js.native
  
  @JSName("Office.EffectParameter_typekey")
  var OfficeDotEffectParameter_typekey: EffectParameter = js.native
  
  var Value: js.Any = js.native
}
object EffectParameter {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EffectParameterMutableBuilder[Self <: EffectParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotEffectParameter_typekey(value: EffectParameter): Self = StObject.set(x, "Office.EffectParameter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
