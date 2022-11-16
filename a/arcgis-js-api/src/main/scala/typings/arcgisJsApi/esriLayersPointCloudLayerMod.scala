package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointCloudLayer
import typings.arcgisJsApi.esri.PointCloudLayerProperties
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.SceneServiceVersion
import typings.arcgisJsApi.esri.SpatialReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersPointCloudLayerMod {
  
  @JSImport("esri/layers/PointCloudLayer", JSImport.Namespace)
  @js.native
  /**
    * The PointCloudLayer is designed for visualizing large collections of points in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html)
    */
  open class ^ ()
    extends StObject
       with PointCloudLayer {
    def this(properties: PointCloudLayerProperties) = this()
    
    /**
      * An authorization string used to access a resource or service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
      */
    /* CompleteClass */
    var apiKey: String = js.native
    
    /**
      * The copyright text as defined by the scene service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
      */
    /* CompleteClass */
    var copyright: String = js.native
    
    /**
      * The layer ID, or layer index, of a Scene Service layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId)
      */
    /* CompleteClass */
    var layerId: Double = js.native
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
    
    /**
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
    
    /**
      * The spatial reference of the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#spatialReference)
      */
    /* CompleteClass */
    var spatialReference: SpatialReference = js.native
    
    /**
      * The URL of the REST endpoint of the layer or scene service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url)
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * The version of the scene service specification used for this service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
      */
    /* CompleteClass */
    override val version: SceneServiceVersion = js.native
  }
  @JSImport("esri/layers/PointCloudLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PointCloudLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PointCloudLayer]
}
