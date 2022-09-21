package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod extends Shortcut {
  
  @JSImport("esri/rest/route", JSImport.Namespace)
  @js.native
  val ^ : route = js.native
  
  type _To = route
  
  /* This means you don't have to write `^`, but can instead just say `routeMod.foo` */
  override def _to: route = ^
}
