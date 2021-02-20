package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldColumnProperties extends ColumnProperties {
  
  /**
    * The field configuration for the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#config)
    */
  var config: js.UndefOr[FieldColumnConfigProperties] = js.native
  
  /**
    * Controls the sort order of the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#direction)
    */
  var direction: js.UndefOr[asc_ | desc_ | js.Any] = js.native
  
  /**
    * The [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) associated with this column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#field)
    */
  var field: js.UndefOr[FieldProperties] = js.native
  
  /**
    * If applicable, the associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) tied to the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
}
object FieldColumnProperties {
  
  @scala.inline
  def apply(): FieldColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldColumnProperties]
  }
  
  @scala.inline
  implicit class FieldColumnPropertiesMutableBuilder[Self <: FieldColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: FieldColumnConfigProperties): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDirection(value: asc_ | desc_ | js.Any): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setField(value: FieldProperties): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
