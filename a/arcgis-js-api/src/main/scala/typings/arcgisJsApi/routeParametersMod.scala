package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteParameters
import typings.arcgisJsApi.esri.RouteParametersConstructor
import typings.arcgisJsApi.esri.RouteParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/RouteParameters", JSImport.Namespace)
  @js.native
  val ^ : RouteParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/RouteParameters", JSImport.Namespace)
  @js.native
  class Class () extends RouteParameters {
    def this(properties: RouteParametersProperties) = this()
  }
  
  type _To = RouteParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `routeParametersMod.foo` */
  override def _to: RouteParametersConstructor = ^
}
