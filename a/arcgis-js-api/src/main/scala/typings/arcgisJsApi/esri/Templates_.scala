package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Templates_ extends StObject {
  
  /**
    * Includes the primary PopupTemplate suggested for the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Templates)
    */
  var primaryTemplate: Template
  
  /**
    * Includes secondary PopupTemplates that may be applied to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Templates)
    */
  var secondaryTemplates: js.Array[Template]
}
object Templates_ {
  
  inline def apply(primaryTemplate: Template, secondaryTemplates: js.Array[Template]): Templates_ = {
    val __obj = js.Dynamic.literal(primaryTemplate = primaryTemplate.asInstanceOf[js.Any], secondaryTemplates = secondaryTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templates_]
  }
  
  extension [Self <: Templates_](x: Self) {
    
    inline def setPrimaryTemplate(value: Template): Self = StObject.set(x, "primaryTemplate", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTemplates(value: js.Array[Template]): Self = StObject.set(x, "secondaryTemplates", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTemplatesVarargs(value: Template*): Self = StObject.set(x, "secondaryTemplates", js.Array(value*))
  }
}
