package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInfosConfig extends StObject {
  
  /**
  		 * The fields that record who adds or edits data in the feature service and when the edit is made.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#FieldInfosConfig)
  		 */
  var editFieldsInfo: js.UndefOr[EditFieldsInfo] = js.undefined
  
  /**
  		 * The fields displayed within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#FieldInfosConfig)
  		 */
  var fields: js.Array[Field]
  
  /**
  		 * The object id field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#FieldInfosConfig)
  		 */
  var objectIdField: js.UndefOr[String] = js.undefined
}
object FieldInfosConfig {
  
  inline def apply(fields: js.Array[Field]): FieldInfosConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfosConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldInfosConfig] (val x: Self) extends AnyVal {
    
    inline def setEditFieldsInfo(value: EditFieldsInfo): Self = StObject.set(x, "editFieldsInfo", value.asInstanceOf[js.Any])
    
    inline def setEditFieldsInfoUndefined: Self = StObject.set(x, "editFieldsInfo", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setObjectIdFieldUndefined: Self = StObject.set(x, "objectIdField", js.undefined)
  }
}
