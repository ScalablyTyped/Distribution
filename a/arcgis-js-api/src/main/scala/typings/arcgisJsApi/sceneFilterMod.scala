package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneFilter
import typings.arcgisJsApi.esri.SceneFilterConstructor
import typings.arcgisJsApi.esri.SceneFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneFilterMod extends Shortcut {
  
  @JSImport("esri/layers/support/SceneFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SceneFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SceneFilter", JSImport.Namespace)
  @js.native
  /**
    * A SceneFilter is a collection of polygons and a type which can be set on a layer to spatially mask out features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html)
    */
  open class Class ()
    extends StObject
       with SceneFilter {
    def this(properties: SceneFilterProperties) = this()
  }
  
  type _To = js.Object & SceneFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneFilterMod.foo` */
  override def _to: js.Object & SceneFilterConstructor = ^
}
