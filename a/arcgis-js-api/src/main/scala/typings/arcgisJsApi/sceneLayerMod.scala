package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneLayer
import typings.arcgisJsApi.esri.SceneLayerConstructor
import typings.arcgisJsApi.esri.SceneLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneLayerMod extends Shortcut {
  
  @JSImport("esri/layers/SceneLayer", JSImport.Namespace)
  @js.native
  val ^ : SceneLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/SceneLayer", JSImport.Namespace)
  @js.native
  /**
    * The SceneLayer is a layer type designed for on-demand streaming and displaying large amounts of data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html)
    */
  class Class () extends SceneLayer {
    def this(properties: SceneLayerProperties) = this()
  }
  
  type _To = SceneLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneLayerMod.foo` */
  override def _to: SceneLayerConstructor = ^
}
