package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SceneModifications
import typings.arcgisJsApi.esri.SceneModificationsConstructor
import typings.arcgisJsApi.esri.SceneModificationsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneModificationsMod extends Shortcut {
  
  @JSImport("esri/layers/support/SceneModifications", JSImport.Namespace)
  @js.native
  val ^ : SceneModificationsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/SceneModifications", JSImport.Namespace)
  @js.native
  class Class () extends SceneModifications {
    def this(properties: SceneModificationsProperties) = this()
  }
  
  type _To = SceneModificationsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `sceneModificationsMod.foo` */
  override def _to: SceneModificationsConstructor = ^
}
