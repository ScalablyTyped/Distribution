package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * This object contains utility methods for obtaining information about supported renderers of raster layers (i.e.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html)
	 */
trait utils extends StObject {
  
  /**
  		 * Returns default band ids used by a multispectral imagery layer when using a raster [rgb](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html) or [stretch](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-stretch.html) renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getDefaultBandCombination)
  		 */
  def getDefaultBandCombination(params: utilsGetDefaultBandCombinationParams): js.Promise[js.Array[Double]]
  
  /**
  		 * Returns supported raster renderer information of an imagery layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getSupportedRendererInfo)
  		 */
  def getSupportedRendererInfo(params: utilsGetSupportedRendererInfoParams): js.Promise[SupportedRendererInfo]
}
object utils {
  
  inline def apply(
    getDefaultBandCombination: utilsGetDefaultBandCombinationParams => js.Promise[js.Array[Double]],
    getSupportedRendererInfo: utilsGetSupportedRendererInfoParams => js.Promise[SupportedRendererInfo]
  ): utils = {
    val __obj = js.Dynamic.literal(getDefaultBandCombination = js.Any.fromFunction1(getDefaultBandCombination), getSupportedRendererInfo = js.Any.fromFunction1(getSupportedRendererInfo))
    __obj.asInstanceOf[utils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: utils] (val x: Self) extends AnyVal {
    
    inline def setGetDefaultBandCombination(value: utilsGetDefaultBandCombinationParams => js.Promise[js.Array[Double]]): Self = StObject.set(x, "getDefaultBandCombination", js.Any.fromFunction1(value))
    
    inline def setGetSupportedRendererInfo(value: utilsGetSupportedRendererInfoParams => js.Promise[SupportedRendererInfo]): Self = StObject.set(x, "getSupportedRendererInfo", js.Any.fromFunction1(value))
  }
}
