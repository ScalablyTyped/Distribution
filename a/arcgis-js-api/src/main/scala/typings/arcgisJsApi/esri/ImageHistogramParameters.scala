package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageHistogramParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Input geometry that defines the area of interest for which the histograms and statistics will be computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#geometry)
    */
  var geometry: Extent | Polygon = js.native
  
  /**
    * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) on how individual images should be mosaicked when the histogram is computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  
  /**
    * Specifies the pixel size (or the resolution).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#pixelSize)
    */
  var pixelSize: PixelSize = js.native
  
  /**
    * Specifies the [rendering rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html) from which to compute the statistics and histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#renderingRule)
    */
  var renderingRule: RasterFunction = js.native
  
  /**
    * The [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html) for which to compute the statistics and histogram.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
}
