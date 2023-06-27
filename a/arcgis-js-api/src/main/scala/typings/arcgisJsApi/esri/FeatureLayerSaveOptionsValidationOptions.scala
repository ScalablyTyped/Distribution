package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerSaveOptionsValidationOptions extends StObject {
  
  /**
  		 * Indicates whether to ignore saving unsupported layers or layers with unsupported content, such as unsupported symbology.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#save)
  		 */
  var ignoreUnsupported: js.UndefOr[Boolean] = js.undefined
}
object FeatureLayerSaveOptionsValidationOptions {
  
  inline def apply(): FeatureLayerSaveOptionsValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerSaveOptionsValidationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerSaveOptionsValidationOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnsupported(value: Boolean): Self = StObject.set(x, "ignoreUnsupported", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnsupportedUndefined: Self = StObject.set(x, "ignoreUnsupported", js.undefined)
  }
}
