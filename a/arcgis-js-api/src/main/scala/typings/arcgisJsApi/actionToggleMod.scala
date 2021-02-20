package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ActionToggle
import typings.arcgisJsApi.esri.ActionToggleConstructor
import typings.arcgisJsApi.esri.ActionToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionToggleMod extends Shortcut {
  
  @JSImport("esri/support/actions/ActionToggle", JSImport.Namespace)
  @js.native
  val ^ : ActionToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/actions/ActionToggle", JSImport.Namespace)
  @js.native
  class Class () extends ActionToggle {
    def this(properties: ActionToggleProperties) = this()
  }
  
  type _To = ActionToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `actionToggleMod.foo` */
  override def _to: ActionToggleConstructor = ^
}
