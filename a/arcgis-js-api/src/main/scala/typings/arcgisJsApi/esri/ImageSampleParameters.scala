package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSampleParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Input geometry that defines the locations to be sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#geometry)
    */
  var geometry: Point | Multipoint | Polyline | Extent | Polygon = js.native
  
  /**
    * Defines how to interpolate pixel values.
    *
    * @default nearest
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#interpolation)
    */
  var interpolation: nearest | bilinear | cubic | majority = js.native
  
  /**
    * When sampling multiple locations, you can use an array of [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instead of providing a [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) for the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#geometry) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#locations)
    */
  var locations: js.Array[Point] = js.native
  
  /**
    * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) defining the image sort order and selection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#mosaicRule)
    */
  var mosaicRule: MosaicRule = js.native
  
  /**
    * The list of fields associated with the rasters to be included in the response.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Specifies the pixel size (or the resolution) that will be used for the sampling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#pixelSize)
    */
  var pixelSize: PixelSize = js.native
  
  /**
    * When `true`, returns the first valid pixel value that meets specified conditions at each sampling point location.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#returnFirstValueOnly)
    */
  var returnFirstValueOnly: Boolean = js.native
  
  /**
    * Specifies the approximate number of locations to sample from the provided geometry when the input geometry is [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#sampleCount)
    */
  var sampleCount: Double = js.native
  
  /**
    * Specifies the distance interval to sample points from the provided [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#geometry) when input geometry is [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#sampleDistance)
    */
  var sampleDistance: Double = js.native
  
  /**
    * Specifies the slice id of a multidimensional raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#sliceId)
    */
  var sliceId: Double = js.native
  
  /**
    * The [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html) for which to perform sampling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
}
