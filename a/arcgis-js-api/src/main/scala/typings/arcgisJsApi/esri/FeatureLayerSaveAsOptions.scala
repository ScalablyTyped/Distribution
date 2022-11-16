package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerSaveAsOptions extends StObject {
  
  /**
    * The portal folder where the layer's portal item will be saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#saveAs)
    */
  var folder: js.UndefOr[PortalFolder] = js.undefined
  
  /**
    * Options for validating the save operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#saveAs)
    */
  var validationOptions: js.UndefOr[FeatureLayerSaveAsOptionsValidationOptions] = js.undefined
}
object FeatureLayerSaveAsOptions {
  
  inline def apply(): FeatureLayerSaveAsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerSaveAsOptions]
  }
  
  extension [Self <: FeatureLayerSaveAsOptions](x: Self) {
    
    inline def setFolder(value: PortalFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setValidationOptions(value: FeatureLayerSaveAsOptionsValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
    
    inline def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
  }
}
