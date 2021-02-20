package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifyResultProperties extends StObject {
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.native
  
  /**
    * An identified feature from the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerId)
    */
  var layerId: js.UndefOr[Double] = js.native
  
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerName)
    */
  var layerName: js.UndefOr[String] = js.native
}
object IdentifyResultProperties {
  
  @scala.inline
  def apply(): IdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyResultProperties]
  }
  
  @scala.inline
  implicit class IdentifyResultPropertiesMutableBuilder[Self <: IdentifyResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayFieldName(value: String): Self = StObject.set(x, "displayFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldNameUndefined: Self = StObject.set(x, "displayFieldName", js.undefined)
    
    @scala.inline
    def setFeature(value: GraphicProperties): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
  }
}
