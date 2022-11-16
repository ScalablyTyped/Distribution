package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ElevationLayer
import typings.arcgisJsApi.esri.ElevationLayerProperties
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.TileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersElevationLayerMod {
  
  @JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * ElevationLayer is a tile layer used for rendering elevations in [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html)
    */
  open class ^ ()
    extends StObject
       with ElevationLayer {
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
    var portalItem: PortalItem = js.native
    
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
  @JSImport("esri/layers/ElevationLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ElevationLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ElevationLayer]
}
