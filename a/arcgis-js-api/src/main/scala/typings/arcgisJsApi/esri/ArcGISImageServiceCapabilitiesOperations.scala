package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceCapabilitiesOperations extends StObject {
  
  /**
    * Indicates if the elevation layer supports an operation to [compute volumes](https://developers.arcgis.com/rest/services-reference/calculate-volume.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsCalculateVolume: Boolean
  
  /**
    * Indicates if the layer supports a [compute histograms](https://developers.arcgis.com/rest/services-reference/compute-histograms.htm) operation from an area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputeHistograms: Boolean
  
  /**
    * Indicates if the layer supports [computing pixel location](https://developers.arcgis.com/rest/services-reference/compute-pixel-location.htm) in pixel space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputePixelLocation: Boolean
  
  /**
    * Indicates if the layer supports an operation [computing statistics and histograms](https://developers.arcgis.com/rest/services-reference/compute-statistics-and-histograms.htm) from an area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputeStatisticsHistograms: Boolean
  
  /**
    * Indicates if the layer allows the source image to be [downloaded](https://developers.arcgis.com/rest/services-reference/download-rasters.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsDownload: Boolean
  
  /**
    * Indicates if the layer supports an [export image](https://developers.arcgis.com/rest/services-reference/export-image.htm) operation based on a bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsExportImage: Boolean
  
  /**
    * Indicates if the layer supports a [sampling operation](https://developers.arcgis.com/rest/services-reference/get-samples.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsGetSamples: Boolean
  
  /**
    * Indicates if the layer supports an [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html#identify) operation on pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsIdentify: Boolean
  
  /**
    * Indicates if the layer supports mensuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsMeasure: Boolean
  
  /**
    * Indicates if the layer supports [projection of geometries](https://developers.arcgis.com/rest/services-reference/project.htm), including from/to image spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsProject: Boolean
  
  /**
    * Indicates if the layer supports an operation to [query images](https://developers.arcgis.com/rest/services-reference/query-image-service-.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsQuery: Boolean
  
  /**
    * Indicates if the layer supports an operation to [query the service's boundary](https://developers.arcgis.com/rest/services-reference/query-boundary.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsQueryBoundary: Boolean
}
object ArcGISImageServiceCapabilitiesOperations {
  
  inline def apply(
    supportsCalculateVolume: Boolean,
    supportsComputeHistograms: Boolean,
    supportsComputePixelLocation: Boolean,
    supportsComputeStatisticsHistograms: Boolean,
    supportsDownload: Boolean,
    supportsExportImage: Boolean,
    supportsGetSamples: Boolean,
    supportsIdentify: Boolean,
    supportsMeasure: Boolean,
    supportsProject: Boolean,
    supportsQuery: Boolean,
    supportsQueryBoundary: Boolean
  ): ArcGISImageServiceCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(supportsCalculateVolume = supportsCalculateVolume.asInstanceOf[js.Any], supportsComputeHistograms = supportsComputeHistograms.asInstanceOf[js.Any], supportsComputePixelLocation = supportsComputePixelLocation.asInstanceOf[js.Any], supportsComputeStatisticsHistograms = supportsComputeStatisticsHistograms.asInstanceOf[js.Any], supportsDownload = supportsDownload.asInstanceOf[js.Any], supportsExportImage = supportsExportImage.asInstanceOf[js.Any], supportsGetSamples = supportsGetSamples.asInstanceOf[js.Any], supportsIdentify = supportsIdentify.asInstanceOf[js.Any], supportsMeasure = supportsMeasure.asInstanceOf[js.Any], supportsProject = supportsProject.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsQueryBoundary = supportsQueryBoundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilitiesOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISImageServiceCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    inline def setSupportsCalculateVolume(value: Boolean): Self = StObject.set(x, "supportsCalculateVolume", value.asInstanceOf[js.Any])
    
    inline def setSupportsComputeHistograms(value: Boolean): Self = StObject.set(x, "supportsComputeHistograms", value.asInstanceOf[js.Any])
    
    inline def setSupportsComputePixelLocation(value: Boolean): Self = StObject.set(x, "supportsComputePixelLocation", value.asInstanceOf[js.Any])
    
    inline def setSupportsComputeStatisticsHistograms(value: Boolean): Self = StObject.set(x, "supportsComputeStatisticsHistograms", value.asInstanceOf[js.Any])
    
    inline def setSupportsDownload(value: Boolean): Self = StObject.set(x, "supportsDownload", value.asInstanceOf[js.Any])
    
    inline def setSupportsExportImage(value: Boolean): Self = StObject.set(x, "supportsExportImage", value.asInstanceOf[js.Any])
    
    inline def setSupportsGetSamples(value: Boolean): Self = StObject.set(x, "supportsGetSamples", value.asInstanceOf[js.Any])
    
    inline def setSupportsIdentify(value: Boolean): Self = StObject.set(x, "supportsIdentify", value.asInstanceOf[js.Any])
    
    inline def setSupportsMeasure(value: Boolean): Self = StObject.set(x, "supportsMeasure", value.asInstanceOf[js.Any])
    
    inline def setSupportsProject(value: Boolean): Self = StObject.set(x, "supportsProject", value.asInstanceOf[js.Any])
    
    inline def setSupportsQuery(value: Boolean): Self = StObject.set(x, "supportsQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsQueryBoundary(value: Boolean): Self = StObject.set(x, "supportsQueryBoundary", value.asInstanceOf[js.Any])
  }
}
