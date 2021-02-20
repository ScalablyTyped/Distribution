package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneService
import typings.arcgisJsApi.esri.SceneServiceConstructor
import typings.arcgisJsApi.esri.SceneServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneServiceMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/SceneService", JSImport.Namespace)
  @js.native
  val ^ : SceneServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/SceneService", JSImport.Namespace)
  @js.native
  class Class () extends SceneService {
    def this(properties: SceneServiceProperties) = this()
  }
  
  type _To = SceneServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneServiceMod.foo` */
  override def _to: SceneServiceConstructor = ^
}
