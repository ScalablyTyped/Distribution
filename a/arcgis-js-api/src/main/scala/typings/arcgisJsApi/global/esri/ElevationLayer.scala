package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ElevationLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ElevationLayer")
@js.native
/**
		 * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
		 */
open class ElevationLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.ElevationLayer {
  def this(properties: ElevationLayerProperties) = this()
  
  /**
  		 * The copyright text as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
  		 */
  /* CompleteClass */
  var copyright: String = js.native
  
  /**
  		 * The portal item from which the layer is loaded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
  		 */
  /* CompleteClass */
  var portalItem: typings.arcgisJsApi.esri.PortalItem = js.native
  
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
object ElevationLayer {
  
  @JSGlobal("__esri.ElevationLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ElevationLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ElevationLayer]
}
