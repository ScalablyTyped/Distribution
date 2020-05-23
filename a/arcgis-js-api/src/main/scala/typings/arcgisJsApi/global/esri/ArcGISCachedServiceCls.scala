package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ArcGISCachedServiceProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.ArcGISCachedService")
@js.native
class ArcGISCachedServiceCls ()
  extends typings.arcgisJsApi.esri.ArcGISCachedService {
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
  override val spatialReference: typings.arcgisJsApi.esri.SpatialReference = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  /* CompleteClass */
  override var tileInfo: typings.arcgisJsApi.esri.TileInfo = js.native
}

