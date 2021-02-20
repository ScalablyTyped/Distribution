package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteResult
import typings.arcgisJsApi.esri.RouteResultConstructor
import typings.arcgisJsApi.esri.RouteResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeResultMod extends Shortcut {
  
  @JSImport("esri/tasks/support/RouteResult", JSImport.Namespace)
  @js.native
  val ^ : RouteResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/RouteResult", JSImport.Namespace)
  @js.native
  class Class () extends RouteResult {
    def this(properties: RouteResultProperties) = this()
  }
  
  type _To = RouteResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `routeResultMod.foo` */
  override def _to: RouteResultConstructor = ^
}
