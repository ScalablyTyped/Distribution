package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapService extends js.Object {
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  val capabilities: ArcGISMapServiceCapabilities
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: String
  /**
    * The full extent of the layer as defined by the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#fullExtent)
    */
  var fullExtent: Extent
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#spatialReference)
    */
  val spatialReference: SpatialReference
  /**
    * The version of ArcGIS Server in which the map service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
    */
  val version: Double
}

object ArcGISMapService {
  @scala.inline
  def apply(
    capabilities: ArcGISMapServiceCapabilities,
    copyright: String,
    fullExtent: Extent,
    legendEnabled: Boolean,
    spatialReference: SpatialReference,
    version: Double
  ): ArcGISMapService = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], fullExtent = fullExtent.asInstanceOf[js.Any], legendEnabled = legendEnabled.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapService]
  }
}

