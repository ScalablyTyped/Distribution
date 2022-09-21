package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locatorMod extends Shortcut {
  
  @JSImport("esri/rest/locator", JSImport.Namespace)
  @js.native
  val ^ : locator = js.native
  
  type _To = locator
  
  /* This means you don't have to write `^`, but can instead just say `locatorMod.foo` */
  override def _to: locator = ^
}
