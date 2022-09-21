package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnTemplateProperties
  extends StObject
     with ColumnTemplateBaseProperties {
  
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html#editable)
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a field requires a value.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html#required)
    */
  var required: js.UndefOr[Boolean] = js.undefined
}
object ColumnTemplateProperties {
  
  inline def apply(): ColumnTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTemplateProperties]
  }
  
  extension [Self <: ColumnTemplateProperties](x: Self) {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
