package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxInputProperties extends StObject {
  
  /**
    * The text used to represent a null value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#noValueOptionLabel)
    */
  var noValueOptionLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether a null value option is displayed.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#showNoValueOption)
    */
  var showNoValueOption: js.UndefOr[Boolean] = js.undefined
}
object ComboBoxInputProperties {
  
  inline def apply(): ComboBoxInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboBoxInputProperties]
  }
  
  extension [Self <: ComboBoxInputProperties](x: Self) {
    
    inline def setNoValueOptionLabel(value: String): Self = StObject.set(x, "noValueOptionLabel", value.asInstanceOf[js.Any])
    
    inline def setNoValueOptionLabelUndefined: Self = StObject.set(x, "noValueOptionLabel", js.undefined)
    
    inline def setShowNoValueOption(value: Boolean): Self = StObject.set(x, "showNoValueOption", value.asInstanceOf[js.Any])
    
    inline def setShowNoValueOptionUndefined: Self = StObject.set(x, "showNoValueOption", js.undefined)
  }
}
