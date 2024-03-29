package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsSizeOptions extends StObject {
  
  /**
  		 * Indicates whether symbol sizes should vary based on view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * In authoring apps, the user may select a pre-defined size scheme.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
}
object univariateColorSizeCreateContinuousRendererParamsSizeOptions {
  
  inline def apply(): univariateColorSizeCreateContinuousRendererParamsSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeCreateContinuousRendererParamsSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setSizeOptimizationEnabled(value: Boolean): Self = StObject.set(x, "sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    
    inline def setSizeOptimizationEnabledUndefined: Self = StObject.set(x, "sizeOptimizationEnabled", js.undefined)
    
    inline def setSizeScheme(value: SizeScheme): Self = StObject.set(x, "sizeScheme", value.asInstanceOf[js.Any])
    
    inline def setSizeSchemeUndefined: Self = StObject.set(x, "sizeScheme", js.undefined)
  }
}
