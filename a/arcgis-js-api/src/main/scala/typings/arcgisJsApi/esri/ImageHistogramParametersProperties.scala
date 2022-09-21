package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ExtentPropertiestypeexten
import typings.arcgisJsApi.anon.PolygonPropertiestypepoly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHistogramParametersProperties extends StObject {
  
  /**
    * Input geometry that defines the area of interest for which the histograms and statistics will be computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#geometry)
    */
  var geometry: js.UndefOr[ExtentPropertiestypeexten | PolygonPropertiestypepoly] = js.undefined
  
  /**
    * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) on how individual images should be mosaicked when the histogram is computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  
  /**
    * Specifies the pixel size (or the resolution).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PixelSize] = js.undefined
  
  /**
    * Specifies the [rendering rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html) from which to compute the statistics and histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * The [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html) for which to compute the statistics and histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}
object ImageHistogramParametersProperties {
  
  inline def apply(): ImageHistogramParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageHistogramParametersProperties]
  }
  
  extension [Self <: ImageHistogramParametersProperties](x: Self) {
    
    inline def setGeometry(value: ExtentPropertiestypeexten | PolygonPropertiestypepoly): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    inline def setPixelSize(value: PixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    inline def setRenderingRule(value: RasterFunctionProperties): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}
