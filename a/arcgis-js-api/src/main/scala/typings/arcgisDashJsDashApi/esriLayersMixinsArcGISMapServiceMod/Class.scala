package typings.arcgisDashJsDashApi.esriLayersMixinsArcGISMapServiceMod

import typings.arcgisDashJsDashApi.__esri.ArcGISMapService
import typings.arcgisDashJsDashApi.__esri.ArcGISMapServiceCapabilities
import typings.arcgisDashJsDashApi.__esri.ArcGISMapServiceProperties
import typings.arcgisDashJsDashApi.__esri.Extent
import typings.arcgisDashJsDashApi.__esri.SpatialReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
@js.native
class Class () extends ArcGISMapService {
  def this(properties: ArcGISMapServiceProperties) = this()
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  /* CompleteClass */
  override val capabilities: ArcGISMapServiceCapabilities = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: String = js.native
  /**
    * The full extent of the layer as defined by the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#fullExtent)
    */
  /* CompleteClass */
  override var fullExtent: Extent = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  /* CompleteClass */
  override var legendEnabled: Boolean = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#spatialReference)
    */
  /* CompleteClass */
  override val spatialReference: SpatialReference = js.native
  /**
    * The version of ArcGIS Server in which the map service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#version)
    */
  /* CompleteClass */
  override val version: Double = js.native
}

