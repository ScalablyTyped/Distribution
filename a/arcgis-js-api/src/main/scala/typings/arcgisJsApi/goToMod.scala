package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GoTo
import typings.arcgisJsApi.esri.GoToConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object goToMod extends Shortcut {
  
  @JSImport("esri/widgets/support/GoTo", JSImport.Namespace)
  @js.native
  val ^ : GoToConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/GoTo", JSImport.Namespace)
  @js.native
  class Class () extends GoTo
  
  type _To = GoToConstructor
  
  /* This means you don't have to write `^`, but can instead just say `goToMod.foo` */
  override def _to: GoToConstructor = ^
}
