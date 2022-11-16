package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`radio-buttons`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.RadioButtonsInputProperties & {  type :'radio-buttons'} */
trait RadioButtonsInputProperti extends StObject {
  
  /**
    * The text used to represent a null value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html#noValueOptionLabel)
    */
  var noValueOptionLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether a null value option is displayed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html#showNoValueOption)
    */
  var showNoValueOption: js.UndefOr[Boolean] = js.undefined
  
  var `type`: `radio-buttons`
}
object RadioButtonsInputProperti {
  
  inline def apply(): RadioButtonsInputProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("radio-buttons")
    __obj.asInstanceOf[RadioButtonsInputProperti]
  }
  
  extension [Self <: RadioButtonsInputProperti](x: Self) {
    
    inline def setNoValueOptionLabel(value: String): Self = StObject.set(x, "noValueOptionLabel", value.asInstanceOf[js.Any])
    
    inline def setNoValueOptionLabelUndefined: Self = StObject.set(x, "noValueOptionLabel", js.undefined)
    
    inline def setShowNoValueOption(value: Boolean): Self = StObject.set(x, "showNoValueOption", value.asInstanceOf[js.Any])
    
    inline def setShowNoValueOptionUndefined: Self = StObject.set(x, "showNoValueOption", js.undefined)
    
    inline def setType(value: `radio-buttons`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
