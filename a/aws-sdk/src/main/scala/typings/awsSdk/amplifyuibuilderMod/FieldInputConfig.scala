package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInputConfig extends StObject {
  
  /**
    * Specifies whether a field has a default value.
    */
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default country code for a phone number.
    */
  var defaultCountryCode: js.UndefOr[String] = js.undefined
  
  /**
    * The default value for the field.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display to describe the field.
    */
  var descriptiveText: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum value to display for the field.
    */
  var maxValue: js.UndefOr[Float] = js.undefined
  
  /**
    * The minimum value to display for the field.
    */
  var minValue: js.UndefOr[Float] = js.undefined
  
  /**
    * The name of the field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display as a placeholder for the field.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a read only field.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a field that requires input.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The stepping increment for a numeric value in a field.
    */
  var step: js.UndefOr[Float] = js.undefined
  
  /**
    * The input type for the field. 
    */
  var `type`: String
  
  /**
    * The value for the field.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * The information to use to customize the input fields with data at runtime.
    */
  var valueMappings: js.UndefOr[ValueMappings] = js.undefined
}
object FieldInputConfig {
  
  inline def apply(`type`: String): FieldInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInputConfig]
  }
  
  extension [Self <: FieldInputConfig](x: Self) {
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultCountryCode(value: String): Self = StObject.set(x, "defaultCountryCode", value.asInstanceOf[js.Any])
    
    inline def setDefaultCountryCodeUndefined: Self = StObject.set(x, "defaultCountryCode", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescriptiveText(value: String): Self = StObject.set(x, "descriptiveText", value.asInstanceOf[js.Any])
    
    inline def setDescriptiveTextUndefined: Self = StObject.set(x, "descriptiveText", js.undefined)
    
    inline def setMaxValue(value: Float): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Float): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStep(value: Float): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueMappings(value: ValueMappings): Self = StObject.set(x, "valueMappings", value.asInstanceOf[js.Any])
    
    inline def setValueMappingsUndefined: Self = StObject.set(x, "valueMappings", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
