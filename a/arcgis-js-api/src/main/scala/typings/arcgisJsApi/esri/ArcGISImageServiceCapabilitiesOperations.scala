package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceCapabilitiesOperations
  extends StObject
     with Object {
  
  /**
    * Indicates if the elevation layer supports an operation to [compute volumes](https://developers.arcgis.com/rest/services-reference/calculate-volume.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsCalculateVolume: Unit
  
  /**
    * Indicates if the layer supports a [compute histograms](https://developers.arcgis.com/rest/services-reference/compute-histograms.htm) operation from an area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputeHistograms: Unit
  
  /**
    * Indicates if the layer supports [computing pixel location](https://developers.arcgis.com/rest/services-reference/compute-pixel-location.htm) in pixel space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputePixelLocation: Unit
  
  /**
    * Indicates if the layer supports an operation [computing statistics and histograms](https://developers.arcgis.com/rest/services-reference/compute-statistics-and-histograms.htm) from an area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputeStatisticsHistograms: Unit
  
  /**
    * Indicates if the layer allows the source image to be [downloaded](https://developers.arcgis.com/rest/services-reference/download-rasters.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsDownload: Unit
  
  /**
    * Indicates if the layer supports an [export image](https://developers.arcgis.com/rest/services-reference/export-image.htm) operation based on a bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsExportImage: Unit
  
  /**
    * Indicates if the layer supports a [sampling operation](https://developers.arcgis.com/rest/services-reference/get-samples.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsGetSamples: Unit
  
  /**
    * Indicates if the layer supports an [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ImageServiceIdentifyTask.html) operation on pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsIdentify: Unit
  
  /**
    * Indicates if the layer supports mensuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsMeasure: Unit
  
  /**
    * Indicates if the layer supports [projection of geometries](https://developers.arcgis.com/rest/services-reference/project.htm), including from/to image spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsProject: Unit
  
  /**
    * Indicates if the layer supports an operation to [query images](https://developers.arcgis.com/rest/services-reference/query-image-service-.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsQuery: Unit
  
  /**
    * Indicates if the layer supports an operation to [query the service's boundary](https://developers.arcgis.com/rest/services-reference/query-boundary.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsQueryBoundary: Unit
}
object ArcGISImageServiceCapabilitiesOperations {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCalculateVolume: Unit,
    supportsComputeHistograms: Unit,
    supportsComputePixelLocation: Unit,
    supportsComputeStatisticsHistograms: Unit,
    supportsDownload: Unit,
    supportsExportImage: Unit,
    supportsGetSamples: Unit,
    supportsIdentify: Unit,
    supportsMeasure: Unit,
    supportsProject: Unit,
    supportsQuery: Unit,
    supportsQueryBoundary: Unit
  ): ArcGISImageServiceCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCalculateVolume = supportsCalculateVolume.asInstanceOf[js.Any], supportsComputeHistograms = supportsComputeHistograms.asInstanceOf[js.Any], supportsComputePixelLocation = supportsComputePixelLocation.asInstanceOf[js.Any], supportsComputeStatisticsHistograms = supportsComputeStatisticsHistograms.asInstanceOf[js.Any], supportsDownload = supportsDownload.asInstanceOf[js.Any], supportsExportImage = supportsExportImage.asInstanceOf[js.Any], supportsGetSamples = supportsGetSamples.asInstanceOf[js.Any], supportsIdentify = supportsIdentify.asInstanceOf[js.Any], supportsMeasure = supportsMeasure.asInstanceOf[js.Any], supportsProject = supportsProject.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsQueryBoundary = supportsQueryBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilitiesOperations]
  }
  
  extension [Self <: ArcGISImageServiceCapabilitiesOperations](x: Self) {
    
    inline def setSupportsCalculateVolume(value: Unit): Self = StObject.set(x, "supportsCalculateVolume", value.asInstanceOf[js.Any])
    
    inline def setSupportsComputeHistograms(value: Unit): Self = StObject.set(x, "supportsComputeHistograms", value.asInstanceOf[js.Any])
    
    inline def setSupportsComputePixelLocation(value: Unit): Self = StObject.set(x, "supportsComputePixelLocation", value.asInstanceOf[js.Any])
    
    inline def setSupportsComputeStatisticsHistograms(value: Unit): Self = StObject.set(x, "supportsComputeStatisticsHistograms", value.asInstanceOf[js.Any])
    
    inline def setSupportsDownload(value: Unit): Self = StObject.set(x, "supportsDownload", value.asInstanceOf[js.Any])
    
    inline def setSupportsExportImage(value: Unit): Self = StObject.set(x, "supportsExportImage", value.asInstanceOf[js.Any])
    
    inline def setSupportsGetSamples(value: Unit): Self = StObject.set(x, "supportsGetSamples", value.asInstanceOf[js.Any])
    
    inline def setSupportsIdentify(value: Unit): Self = StObject.set(x, "supportsIdentify", value.asInstanceOf[js.Any])
    
    inline def setSupportsMeasure(value: Unit): Self = StObject.set(x, "supportsMeasure", value.asInstanceOf[js.Any])
    
    inline def setSupportsProject(value: Unit): Self = StObject.set(x, "supportsProject", value.asInstanceOf[js.Any])
    
    inline def setSupportsQuery(value: Unit): Self = StObject.set(x, "supportsQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsQueryBoundary(value: Unit): Self = StObject.set(x, "supportsQueryBoundary", value.asInstanceOf[js.Any])
  }
}
