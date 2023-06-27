package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImageMeasureParameters extends StObject {
  
  /**
  		 * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) on how individual images should be mosaicked when the measure is computed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#mosaicRule)
  		 */
  var mosaicRule: MosaicRule
  
  /**
  		 * Specifies the pixel size.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#pixelSize)
  		 */
  var pixelSize: PixelSize
}
object BaseImageMeasureParameters {
  
  inline def apply(mosaicRule: MosaicRule, pixelSize: PixelSize): BaseImageMeasureParameters = {
    val __obj = js.Dynamic.literal(mosaicRule = mosaicRule.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImageMeasureParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseImageMeasureParameters] (val x: Self) extends AnyVal {
    
    inline def setMosaicRule(value: MosaicRule): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setPixelSize(value: PixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
  }
}
