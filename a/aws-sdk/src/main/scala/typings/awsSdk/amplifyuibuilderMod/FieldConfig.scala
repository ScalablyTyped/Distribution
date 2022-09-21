package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldConfig extends StObject {
  
  /**
    * Specifies whether to hide a field.
    */
  var excluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the configuration for the default input value to display for a field.
    */
  var inputType: js.UndefOr[FieldInputConfig] = js.undefined
  
  /**
    * The label for the field.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the field position.
    */
  var position: js.UndefOr[FieldPosition] = js.undefined
  
  /**
    * The validations to perform on the value in the field.
    */
  var validations: js.UndefOr[ValidationsList] = js.undefined
}
object FieldConfig {
  
  inline def apply(): FieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfig]
  }
  
  extension [Self <: FieldConfig](x: Self) {
    
    inline def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setInputType(value: FieldInputConfig): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPosition(value: FieldPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setValidations(value: ValidationsList): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    inline def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
    
    inline def setValidationsVarargs(value: FieldValidationConfiguration*): Self = StObject.set(x, "validations", js.Array(value*))
  }
}
