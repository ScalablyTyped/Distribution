package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerProperty extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  val Id: String
  
  /* private */ @JSName("Office.PickerProperty_typekey")
  var OfficeDotPickerProperty_typekey: PickerProperty
  
  val Type: MsoPickerField
  
  val Value: Any
}
object PickerProperty {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Id: String,
    OfficeDotPickerProperty_typekey: PickerProperty,
    Type: MsoPickerField,
    Value: Any
  ): PickerProperty = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PickerProperty_typekey")(OfficeDotPickerProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickerProperty] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotPickerProperty_typekey(value: PickerProperty): Self = StObject.set(x, "Office.PickerProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoPickerField): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
