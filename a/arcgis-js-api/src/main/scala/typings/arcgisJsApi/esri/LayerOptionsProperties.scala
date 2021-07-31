package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerOptionsProperties extends StObject {
  
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#returnTopmostRaster)
    */
  var returnTopmostRaster: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#showNoDataRecords)
    */
  var showNoDataRecords: js.UndefOr[Boolean] = js.undefined
}
object LayerOptionsProperties {
  
  @scala.inline
  def apply(): LayerOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptionsProperties]
  }
  
  @scala.inline
  implicit class LayerOptionsPropertiesMutableBuilder[Self <: LayerOptionsProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnTopmostRaster(value: Boolean): Self = StObject.set(x, "returnTopmostRaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTopmostRasterUndefined: Self = StObject.set(x, "returnTopmostRaster", js.undefined)
    
    @scala.inline
    def setShowNoDataRecords(value: Boolean): Self = StObject.set(x, "showNoDataRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNoDataRecordsUndefined: Self = StObject.set(x, "showNoDataRecords", js.undefined)
  }
}
