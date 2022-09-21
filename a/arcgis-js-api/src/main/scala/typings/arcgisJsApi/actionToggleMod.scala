package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ActionToggle
import typings.arcgisJsApi.esri.ActionToggleConstructor
import typings.arcgisJsApi.esri.ActionToggleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionToggleMod extends Shortcut {
  
  @JSImport("esri/support/actions/ActionToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ActionToggleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/actions/ActionToggle", JSImport.Namespace)
  @js.native
  /**
    * A customizable toggle used in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget that performs a specific action(s) which can be toggled on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html)
    */
  open class Class ()
    extends StObject
       with ActionToggle {
    def this(properties: ActionToggleProperties) = this()
  }
  
  type _To = js.Object & ActionToggleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `actionToggleMod.foo` */
  override def _to: js.Object & ActionToggleConstructor = ^
}
