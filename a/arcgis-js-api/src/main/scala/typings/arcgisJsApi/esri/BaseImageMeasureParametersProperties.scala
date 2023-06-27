package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImageMeasureParametersProperties extends StObject {
  
  /**
  		 * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) on how individual images should be mosaicked when the measure is computed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#mosaicRule)
  		 */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  
  /**
  		 * Specifies the pixel size.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#pixelSize)
  		 */
  var pixelSize: js.UndefOr[PixelSize] = js.undefined
}
object BaseImageMeasureParametersProperties {
  
  inline def apply(): BaseImageMeasureParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseImageMeasureParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseImageMeasureParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    inline def setPixelSize(value: PixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
  }
}
