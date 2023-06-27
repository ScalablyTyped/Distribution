package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ArcGISCachedServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ArcGISCachedService")
@js.native
open class ArcGISCachedService ()
  extends StObject
     with typings.arcgisJsApi.esri.ArcGISCachedService {
  def this(properties: ArcGISCachedServiceProperties) = this()
  
  /**
  		 * The copyright text as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
  		 */
  /* CompleteClass */
  var copyright: String = js.native
  
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
  var tileInfo: typings.arcgisJsApi.esri.TileInfo = js.native
}
/* static members */
object ArcGISCachedService {
  
  @JSGlobal("__esri.ArcGISCachedService")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ArcGISCachedService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ArcGISCachedService]
}
