package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`starting-point`
import typings.arcgisJsApi.arcgisJsApiStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSetting extends StObject {
  
  /**
    * The description that replaces the default sub-headings for either the starting points or barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#InputSetting)
    */
  var description: String
  
  /**
    * The label that replaces either the default "Starting points" or "Barriers" headings depending on what flag type is passed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#InputSetting)
    */
  var label: String
  
  /**
    * The symbol displayed next to either the "Starting points" or "Barriers" headings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#InputSetting)
    */
  var symbol: SimpleMarkerSymbol | PictureMarkerSymbol
  
  /**
    * The flag type indicates which section will have its settings overridden.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html#InputSetting)
    */
  var `type`: `starting-point` | barrier
}
object InputSetting {
  
  inline def apply(
    description: String,
    label: String,
    symbol: SimpleMarkerSymbol | PictureMarkerSymbol,
    `type`: `starting-point` | barrier
  ): InputSetting = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSetting]
  }
  
  extension [Self <: InputSetting](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: SimpleMarkerSymbol | PictureMarkerSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setType(value: `starting-point` | barrier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
