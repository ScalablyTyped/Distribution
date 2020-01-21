package typings.arcgisJsApi.arcGISCachedServiceMod

import typings.arcgisJsApi.esri.ArcGISCachedService
import typings.arcgisJsApi.esri.ArcGISCachedServiceProperties
import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.TileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/mixins/ArcGISCachedService", JSImport.Namespace)
@js.native
class Class () extends ArcGISCachedService {
  def this(properties: ArcGISCachedServiceProperties) = this()
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: String = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
    */
  /* CompleteClass */
  override val spatialReference: SpatialReference = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  /* CompleteClass */
  override var tileInfo: TileInfo = js.native
}

