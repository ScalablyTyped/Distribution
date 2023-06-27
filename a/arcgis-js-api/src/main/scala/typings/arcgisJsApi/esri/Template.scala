package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Template extends StObject {
  
  /**
  		 * The name of the auto-generated PopupTemplate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Template)
  		 */
  var name: String
  
  /**
  		 * The title of the PopupTemplate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Template)
  		 */
  var title: String
  
  /**
  		 * The suggested PopupTemplate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#Template)
  		 */
  var value: PopupTemplate
}
object Template {
  
  inline def apply(name: String, title: String, value: PopupTemplate): Template = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PopupTemplate): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
