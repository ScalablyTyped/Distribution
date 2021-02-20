package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneView
import typings.arcgisJsApi.esri.SceneViewConstructor
import typings.arcgisJsApi.esri.SceneViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneViewMod extends Shortcut {
  
  @JSImport("esri/views/SceneView", JSImport.Namespace)
  @js.native
  val ^ : SceneViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/SceneView", JSImport.Namespace)
  @js.native
  /**
    * A SceneView displays a 3D view of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) or [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) instance using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html)
    */
  class Class () extends SceneView {
    def this(properties: SceneViewProperties) = this()
  }
  
  type _To = SceneViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneViewMod.foo` */
  override def _to: SceneViewConstructor = ^
}
