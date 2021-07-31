package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.SceneLayer
import typings.arcgisJsApi.esri.SceneLayerConstructor
import typings.arcgisJsApi.esri.SceneLayerProperties
import typings.arcgisJsApi.esri.SceneServiceVersion
import typings.arcgisJsApi.esri.SpatialReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneLayerMod extends Shortcut {
  
  @JSImport("esri/layers/SceneLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SceneLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/SceneLayer", JSImport.Namespace)
  @js.native
  /**
    * The SceneLayer is a layer type designed for on-demand streaming and displaying large amounts of data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html)
    */
  class Class ()
    extends StObject
       with SceneLayer {
    def this(properties: SceneLayerProperties) = this()
    
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
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
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
  
  type _To = js.Object & SceneLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneLayerMod.foo` */
  override def _to: js.Object & SceneLayerConstructor = ^
}
