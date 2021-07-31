package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerProperty extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val Id: String
  
  @JSName("Office.PickerProperty_typekey")
  var OfficeDotPickerProperty_typekey: PickerProperty
  
  val Type: MsoPickerField
  
  val Value: js.Any
}
object PickerProperty {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Id: String,
    OfficeDotPickerProperty_typekey: PickerProperty,
    Type: MsoPickerField,
    Value: js.Any
  ): PickerProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerProperty_typekey")(OfficeDotPickerProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProperty]
  }
  
  @scala.inline
  implicit class PickerPropertyMutableBuilder[Self <: PickerProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPickerProperty_typekey(value: PickerProperty): Self = StObject.set(x, "Office.PickerProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoPickerField): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
