package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait flowTheme extends StObject {
  
  /**
    * The Esri basemaps that pair well with the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#Theme)
    */
  var basemaps: js.Array[String]
  
  /**
    * Text describing the theme in the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#Theme)
    */
  var description: String
  
  /**
    * The label identifying the theme in UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#Theme)
    */
  var label: String
  
  /**
    * The name of the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#Theme)
    */
  var name: String
}
object flowTheme {
  
  inline def apply(basemaps: js.Array[String], description: String, label: String, name: String): flowTheme = {
    val __obj = js.Dynamic.literal(basemaps = basemaps.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[flowTheme]
  }
  
  extension [Self <: flowTheme](x: Self) {
    
    inline def setBasemaps(value: js.Array[String]): Self = StObject.set(x, "basemaps", value.asInstanceOf[js.Any])
    
    inline def setBasemapsVarargs(value: String*): Self = StObject.set(x, "basemaps", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
