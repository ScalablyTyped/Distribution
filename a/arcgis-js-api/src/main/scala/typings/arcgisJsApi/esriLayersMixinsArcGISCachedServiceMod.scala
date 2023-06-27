package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ArcGISCachedService
import typings.arcgisJsApi.esri.ArcGISCachedServiceProperties
import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.TileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersMixinsArcGISCachedServiceMod {
  
  @JSImport("esri/layers/mixins/ArcGISCachedService", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ArcGISCachedService {
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
    override val spatialReference: SpatialReference = js.native
    
    /**
    		 * Contains information about the tiling scheme for the layer.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    		 */
    /* CompleteClass */
    var tileInfo: TileInfo = js.native
  }
  @JSImport("esri/layers/mixins/ArcGISCachedService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ArcGISCachedService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ArcGISCachedService]
}
