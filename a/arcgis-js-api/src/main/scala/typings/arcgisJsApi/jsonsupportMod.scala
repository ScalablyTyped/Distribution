package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.JSONSupport
import typings.arcgisJsApi.esri.JSONSupportConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonsupportMod extends Shortcut {
  
  @JSImport("esri/core/JSONSupport", JSImport.Namespace)
  @js.native
  val ^ : JSONSupportConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/JSONSupport", JSImport.Namespace)
  @js.native
  class Class () extends JSONSupport
  
  type _To = JSONSupportConstructor
  
  /* This means you don't have to write `^`, but can instead just say `jsonsupportMod.foo` */
  override def _to: JSONSupportConstructor = ^
}
