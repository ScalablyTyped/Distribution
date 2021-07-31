package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerField extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  val IsHidden: Boolean
  
  val Name: String
  
  @JSName("Office.PickerField_typekey")
  var OfficeDotPickerField_typekey: PickerField
  
  val Type: MsoPickerField
}
object PickerField {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    IsHidden: Boolean,
    Name: String,
    OfficeDotPickerField_typekey: PickerField,
    Type: MsoPickerField
  ): PickerField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], IsHidden = IsHidden.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerField_typekey")(OfficeDotPickerField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerField]
  }
  
  @scala.inline
  implicit class PickerFieldMutableBuilder[Self <: PickerField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = StObject.set(x, "IsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotPickerField_typekey(value: PickerField): Self = StObject.set(x, "Office.PickerField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoPickerField): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
