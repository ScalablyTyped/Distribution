package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioButtonsInputProperties extends StObject {
  
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
}
object RadioButtonsInputProperties {
  
  inline def apply(): RadioButtonsInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonsInputProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioButtonsInputProperties] (val x: Self) extends AnyVal {
    
    inline def setNoValueOptionLabel(value: String): Self = StObject.set(x, "noValueOptionLabel", value.asInstanceOf[js.Any])
    
    inline def setNoValueOptionLabelUndefined: Self = StObject.set(x, "noValueOptionLabel", js.undefined)
    
    inline def setShowNoValueOption(value: Boolean): Self = StObject.set(x, "showNoValueOption", value.asInstanceOf[js.Any])
    
    inline def setShowNoValueOptionUndefined: Self = StObject.set(x, "showNoValueOption", js.undefined)
  }
}
