package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGISImageServiceCapabilitiesOperations extends Object {
  /**
    * Indicates if the elevation layer supports an operation to [compute volumes](https://developers.arcgis.com/rest/services-reference/calculate-volume.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsCalculateVolume: Unit = js.native
  /**
    * Indicates if the layer supports a [compute histograms](https://developers.arcgis.com/rest/services-reference/compute-histograms.htm) operation from an area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputeHistograms: Unit = js.native
  /**
    * Indicates if the layer supports [computing pixel location](https://developers.arcgis.com/rest/services-reference/compute-pixel-location.htm) in pixel space.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputePixelLocation: Unit = js.native
  /**
    * Indicates if the layer supports an operation [computing statistics and histograms](https://developers.arcgis.com/rest/services-reference/compute-statistics-and-histograms.htm) from an area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsComputeStatisticsHistograms: Unit = js.native
  /**
    * Indicates if the layer allows the source image to be [downloaded](https://developers.arcgis.com/rest/services-reference/download-rasters.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsDownload: Unit = js.native
  /**
    * Indicates if the layer supports an [export image](https://developers.arcgis.com/rest/services-reference/export-image.htm) operation based on a bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsExportImage: Unit = js.native
  /**
    * Indicates if the layer supports a [sampling operation](https://developers.arcgis.com/rest/services-reference/get-samples.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsGetSamples: Unit = js.native
  /**
    * Indicates if the layer supports an [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ImageServiceIdentifyTask.html) operation on pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsIdentify: Unit = js.native
  /**
    * Indicates if the layer supports mensuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsMeasure: Unit = js.native
  /**
    * Indicates if the layer supports [projection of geometries](https://developers.arcgis.com/rest/services-reference/project.htm), including from/to image spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsProject: Unit = js.native
  /**
    * Indicates if the layer supports an operation to [query images](https://developers.arcgis.com/rest/services-reference/query-image-service-.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsQuery: Unit = js.native
  /**
    * Indicates if the layer supports an operation to [query the service's boundary](https://developers.arcgis.com/rest/services-reference/query-boundary.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsQueryBoundary: Unit = js.native
}

object ArcGISImageServiceCapabilitiesOperations {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class ArcGISImageServiceCapabilitiesOperationsOps[Self <: ArcGISImageServiceCapabilitiesOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSupportsCalculateVolume(value: Unit): Self = this.set("supportsCalculateVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsComputeHistograms(value: Unit): Self = this.set("supportsComputeHistograms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsComputePixelLocation(value: Unit): Self = this.set("supportsComputePixelLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsComputeStatisticsHistograms(value: Unit): Self = this.set("supportsComputeStatisticsHistograms", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsDownload(value: Unit): Self = this.set("supportsDownload", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsExportImage(value: Unit): Self = this.set("supportsExportImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsGetSamples(value: Unit): Self = this.set("supportsGetSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsIdentify(value: Unit): Self = this.set("supportsIdentify", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsMeasure(value: Unit): Self = this.set("supportsMeasure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsProject(value: Unit): Self = this.set("supportsProject", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsQuery(value: Unit): Self = this.set("supportsQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsQueryBoundary(value: Unit): Self = this.set("supportsQueryBoundary", value.asInstanceOf[js.Any])
  }
  
}

