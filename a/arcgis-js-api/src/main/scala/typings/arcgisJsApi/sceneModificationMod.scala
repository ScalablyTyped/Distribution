package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneModification
import typings.arcgisJsApi.esri.SceneModificationConstructor
import typings.arcgisJsApi.esri.SceneModificationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneModificationMod extends Shortcut {
  
  @JSImport("esri/layers/support/SceneModification", JSImport.Namespace)
  @js.native
  val ^ : SceneModificationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SceneModification", JSImport.Namespace)
  @js.native
  class Class () extends SceneModification {
    def this(properties: SceneModificationProperties) = this()
  }
  
  type _To = SceneModificationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneModificationMod.foo` */
  override def _to: SceneModificationConstructor = ^
}
