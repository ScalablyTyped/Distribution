package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config_ extends StObject {
  
  /**
  		 * The display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
  		 */
  var displayField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The fields that record who adds or edits data in the feature service and when the edit is made.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
  		 */
  var editFieldsInfo: js.UndefOr[EditFieldsInfo] = js.undefined
  
  /**
  		 * The fields displayed within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
  		 */
  var fields: js.Array[Field]
  
  /**
  		 * The object id field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
  		 */
  var objectIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title for the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#Config)
  		 */
  var title: String
}
object Config_ {
  
  inline def apply(fields: js.Array[Field], title: String): Config_ = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config_] (val x: Self) extends AnyVal {
    
    inline def setDisplayField(value: String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    inline def setEditFieldsInfo(value: EditFieldsInfo): Self = StObject.set(x, "editFieldsInfo", value.asInstanceOf[js.Any])
    
    inline def setEditFieldsInfoUndefined: Self = StObject.set(x, "editFieldsInfo", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
