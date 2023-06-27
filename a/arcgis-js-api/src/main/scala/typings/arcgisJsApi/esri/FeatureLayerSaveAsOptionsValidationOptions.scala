package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerSaveAsOptionsValidationOptions extends StObject {
  
  /**
  		 * Indicates whether to ignore saving unsupported layers or layers with unsupported content, such as unsupported symbology.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#saveAs)
  		 */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}
object FeatureLayerSaveAsOptionsValidationOptions {
  
  inline def apply(): FeatureLayerSaveAsOptionsValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerSaveAsOptionsValidationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerSaveAsOptionsValidationOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnsupported(value: Boolean): Self = StObject.set(x, "ignoreUnsupported", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnsupportedUndefined: Self = StObject.set(x, "ignoreUnsupported", js.undefined)
  }
}
