package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Performs various operations on an image service resource:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html)
  */
@js.native
trait imageService extends StObject {
  
  /**
    * Computes the rotation angle of a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) at a given location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles)
    */
  def computeAngles(url: String, parameters: ImageAngleParameters): js.Promise[ImageAngleResult] = js.native
  def computeAngles(url: String, parameters: ImageAngleParametersProperties): js.Promise[ImageAngleResult] = js.native
  def computeAngles(url: String, parameters: ImageAngleParametersProperties, requestOptions: Any): js.Promise[ImageAngleResult] = js.native
  def computeAngles(url: String, parameters: ImageAngleParameters, requestOptions: Any): js.Promise[ImageAngleResult] = js.native
  
  /**
    * Computes histograms based on the provided [ImageHistogramParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeHistograms)
    */
  def computeHistograms(url: String, parameters: ImageHistogramParameters): js.Promise[Any] = js.native
  def computeHistograms(url: String, parameters: ImageHistogramParametersProperties): js.Promise[Any] = js.native
  def computeHistograms(url: String, parameters: ImageHistogramParametersProperties, requestOptions: Any): js.Promise[Any] = js.native
  def computeHistograms(url: String, parameters: ImageHistogramParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * Computes the corresponding pixel location in columns and rows for an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computePixelSpaceLocations)
    */
  def computePixelSpaceLocations(url: String, parameters: ImagePixelLocationParameters): js.Promise[ImagePixelLocationResult] = js.native
  def computePixelSpaceLocations(url: String, parameters: ImagePixelLocationParameters, requestOptions: Any): js.Promise[ImagePixelLocationResult] = js.native
  
  /**
    * Computes [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterBandStatistics) and [histograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterHistogram) for the provided [ImageHistogramParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeStatisticsHistograms)
    */
  def computeStatisticsHistograms(url: String, parameters: ImageHistogramParameters): js.Promise[Any] = js.native
  def computeStatisticsHistograms(url: String, parameters: ImageHistogramParametersProperties): js.Promise[Any] = js.native
  def computeStatisticsHistograms(url: String, parameters: ImageHistogramParametersProperties, requestOptions: Any): js.Promise[Any] = js.native
  def computeStatisticsHistograms(url: String, parameters: ImageHistogramParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * Returns sample point locations, pixel values and corresponding resolutions of the source data for a given geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#getSamples)
    */
  def getSamples(url: String, parameters: ImageSampleParameters): js.Promise[ImageSampleResult] = js.native
  def getSamples(url: String, parameters: ImageSampleParametersProperties): js.Promise[ImageSampleResult] = js.native
  def getSamples(url: String, parameters: ImageSampleParametersProperties, requestOptions: Any): js.Promise[ImageSampleResult] = js.native
  def getSamples(url: String, parameters: ImageSampleParameters, requestOptions: Any): js.Promise[ImageSampleResult] = js.native
  
  /**
    * Sends a request to the ArcGIS REST image service resource to identify content based on the [ImageIdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html) specified in the `params` argument.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#identify)
    */
  def identify(url: String, params: ImageIdentifyParameters): js.Promise[ImageIdentifyResult] = js.native
  def identify(url: String, params: ImageIdentifyParameters, requestOptions: Any): js.Promise[ImageIdentifyResult] = js.native
  
  /**
    * Calculates the area and perimeter of a given geometry on an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureAreaAndPerimeter)
    */
  def measureAreaAndPerimeter(url: String, parameters: ImageAreaParameters): js.Promise[ImageAreaResult] = js.native
  def measureAreaAndPerimeter(url: String, parameters: ImageAreaParametersProperties): js.Promise[ImageAreaResult] = js.native
  def measureAreaAndPerimeter(url: String, parameters: ImageAreaParametersProperties, requestOptions: Any): js.Promise[ImageAreaResult] = js.native
  def measureAreaAndPerimeter(url: String, parameters: ImageAreaParameters, requestOptions: Any): js.Promise[ImageAreaResult] = js.native
  
  /**
    * Calculates the distance and angle between two points on an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureDistanceAndAngle)
    */
  def measureDistanceAndAngle(url: String, parameters: ImageDistanceParameters): js.Promise[ImageDistanceResult] = js.native
  def measureDistanceAndAngle(url: String, parameters: ImageDistanceParametersProperties): js.Promise[ImageDistanceResult] = js.native
  def measureDistanceAndAngle(url: String, parameters: ImageDistanceParametersProperties, requestOptions: Any): js.Promise[ImageDistanceResult] = js.native
  def measureDistanceAndAngle(url: String, parameters: ImageDistanceParameters, requestOptions: Any): js.Promise[ImageDistanceResult] = js.native
  
  /**
    * Calculates the height of an object between two points on an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureHeight)
    */
  def measureHeight(url: String, parameters: ImageHeightParameters): js.Promise[ImageHeightResult] = js.native
  def measureHeight(url: String, parameters: ImageHeightParametersProperties): js.Promise[ImageHeightResult] = js.native
  def measureHeight(url: String, parameters: ImageHeightParametersProperties, requestOptions: Any): js.Promise[ImageHeightResult] = js.native
  def measureHeight(url: String, parameters: ImageHeightParameters, requestOptions: Any): js.Promise[ImageHeightResult] = js.native
  
  /**
    * Returns the location for a given point or centroid of a given area on an image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measurePointOrCentroid)
    */
  def measurePointOrCentroid(parameters: ImagePointParameters): js.Promise[ImagePointResult] = js.native
  def measurePointOrCentroid(parameters: ImagePointParametersProperties): js.Promise[ImagePointResult] = js.native
  def measurePointOrCentroid(parameters: ImagePointParametersProperties, requestOptions: Any): js.Promise[ImagePointResult] = js.native
  def measurePointOrCentroid(parameters: ImagePointParameters, requestOptions: Any): js.Promise[ImagePointResult] = js.native
}
