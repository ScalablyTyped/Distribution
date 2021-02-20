package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Sketch
import typings.arcgisJsApi.esri.SketchConstructor
import typings.arcgisJsApi.esri.SketchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sketchMod extends Shortcut {
  
  @JSImport("esri/widgets/Sketch", JSImport.Namespace)
  @js.native
  val ^ : SketchConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Sketch", JSImport.Namespace)
  @js.native
  /**
    * Sketch widget provides a simple UI for creating and updating graphics on a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html)
    */
  class Class () extends Sketch {
    def this(properties: SketchProperties) = this()
  }
  
  type _To = SketchConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sketchMod.foo` */
  override def _to: SketchConstructor = ^
}
