package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ActionButton
import typings.arcgisJsApi.esri.ActionButtonConstructor
import typings.arcgisJsApi.esri.ActionButtonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionButtonMod extends Shortcut {
  
  @JSImport("esri/support/actions/ActionButton", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ActionButtonConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/actions/ActionButton", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ActionButton {
    def this(properties: ActionButtonProperties) = this()
  }
  
  type _To = js.Object & ActionButtonConstructor
  
  /* This means you don't have to write `^`, but can instead just say `actionButtonMod.foo` */
  override def _to: js.Object & ActionButtonConstructor = ^
}
