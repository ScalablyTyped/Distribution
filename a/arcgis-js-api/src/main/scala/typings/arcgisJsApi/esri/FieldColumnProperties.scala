package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typings.arcgisJsApi.anon.SceneLayerPropertiestypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldColumnProperties
  extends StObject
     with ColumnProperties {
  
  /**
    * The field configuration for the column.
    *
    * @deprecated since version 4.24. Use {@link module:esri/widgets/FeatureTable/support/FieldColumnTemplate} via the FeatureTable's {@link module:esri/widgets/FeatureTable/support/TableTemplate tableTemplate}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#config)
    */
  var config: js.UndefOr[FieldColumnConfigProperties] = js.undefined
  
  /**
    * The [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) associated with this column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#field)
    */
  var field: js.UndefOr[FieldProperties] = js.undefined
  
  /**
    * If applicable, the associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) tied to the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerPropertiestyp | SceneLayerPropertiestypes] = js.undefined
}
object FieldColumnProperties {
  
  inline def apply(): FieldColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldColumnProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldColumnProperties] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: FieldColumnConfigProperties): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setField(value: FieldProperties): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLayer(value: FeatureLayerPropertiestyp | SceneLayerPropertiestypes): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
