package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ExtentPropertiestypeexten
import typings.arcgisJsApi.anon.MultipointPropertiestypem
import typings.arcgisJsApi.anon.PointPropertiestypepoint
import typings.arcgisJsApi.anon.PolygonPropertiestypepoly
import typings.arcgisJsApi.anon.PolylinePropertiestypepol
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSampleParametersProperties extends StObject {
  
  /**
    * Input geometry that defines the locations to be sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#geometry)
    */
  var geometry: js.UndefOr[
    PointPropertiestypepoint | MultipointPropertiestypem | PolylinePropertiestypepol | ExtentPropertiestypeexten | PolygonPropertiestypepoly
  ] = js.undefined
  
  /**
    * Defines how to interpolate pixel values.
    *
    * @default nearest
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#interpolation)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.undefined
  
  /**
    * When sampling multiple locations, you can use an array of [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instead of providing a [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) for the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#geometry) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#locations)
    */
  var locations: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) defining the image sort order and selection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  
  /**
    * The list of fields associated with the rasters to be included in the response.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the pixel size (or the resolution) that will be used for the sampling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PixelSize] = js.undefined
  
  /**
    * When `true`, returns the first valid pixel value that meets specified conditions at each sampling point location.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#returnFirstValueOnly)
    */
  var returnFirstValueOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the approximate number of locations to sample from the provided geometry when the input geometry is [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#sampleCount)
    */
  var sampleCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the distance interval to sample points from the provided [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#geometry) when input geometry is [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#sampleDistance)
    */
  var sampleDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the slice id of a multidimensional raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#sliceId)
    */
  var sliceId: js.UndefOr[Double] = js.undefined
  
  /**
    * The [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html) for which to perform sampling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}
object ImageSampleParametersProperties {
  
  inline def apply(): ImageSampleParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSampleParametersProperties]
  }
  
  extension [Self <: ImageSampleParametersProperties](x: Self) {
    
    inline def setGeometry(
      value: PointPropertiestypepoint | MultipointPropertiestypem | PolylinePropertiestypepol | ExtentPropertiestypeexten | PolygonPropertiestypepoly
    ): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setInterpolation(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setLocations(value: js.Array[PointProperties]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: PointProperties*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setPixelSize(value: PixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    inline def setReturnFirstValueOnly(value: Boolean): Self = StObject.set(x, "returnFirstValueOnly", value.asInstanceOf[js.Any])
    
    inline def setReturnFirstValueOnlyUndefined: Self = StObject.set(x, "returnFirstValueOnly", js.undefined)
    
    inline def setSampleCount(value: Double): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
    
    inline def setSampleDistance(value: Double): Self = StObject.set(x, "sampleDistance", value.asInstanceOf[js.Any])
    
    inline def setSampleDistanceUndefined: Self = StObject.set(x, "sampleDistance", js.undefined)
    
    inline def setSliceId(value: Double): Self = StObject.set(x, "sliceId", value.asInstanceOf[js.Any])
    
    inline def setSliceIdUndefined: Self = StObject.set(x, "sliceId", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}
