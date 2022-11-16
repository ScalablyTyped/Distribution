package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`combo-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ComboBoxInputProperties & {  type :'combo-box'} */
trait ComboBoxInputPropertiesty extends StObject {
  
  /**
    * The text used to represent a null value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#noValueOptionLabel)
    */
  var noValueOptionLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether a null value option is displayed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html#showNoValueOption)
    */
  var showNoValueOption: js.UndefOr[Boolean] = js.undefined
  
  var `type`: `combo-box`
}
object ComboBoxInputPropertiesty {
  
  inline def apply(): ComboBoxInputPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("combo-box")
    __obj.asInstanceOf[ComboBoxInputPropertiesty]
  }
  
  extension [Self <: ComboBoxInputPropertiesty](x: Self) {
    
    inline def setNoValueOptionLabel(value: String): Self = StObject.set(x, "noValueOptionLabel", value.asInstanceOf[js.Any])
    
    inline def setNoValueOptionLabelUndefined: Self = StObject.set(x, "noValueOptionLabel", js.undefined)
    
    inline def setShowNoValueOption(value: Boolean): Self = StObject.set(x, "showNoValueOption", value.asInstanceOf[js.Any])
    
    inline def setShowNoValueOptionUndefined: Self = StObject.set(x, "showNoValueOption", js.undefined)
    
    inline def setType(value: `combo-box`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
