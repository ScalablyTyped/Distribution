package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneLayerView
import typings.arcgisJsApi.esri.SceneLayerViewConstructor
import typings.arcgisJsApi.esri.SceneLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneLayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/SceneLayerView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SceneLayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/SceneLayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html)
    */
  class Class ()
    extends StObject
       with SceneLayerView {
    def this(properties: SceneLayerViewProperties) = this()
  }
  
  type _To = js.Object & SceneLayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneLayerViewMod.foo` */
  override def _to: js.Object & SceneLayerViewConstructor = ^
}
