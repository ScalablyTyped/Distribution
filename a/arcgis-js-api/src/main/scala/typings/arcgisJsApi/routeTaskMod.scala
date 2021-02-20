package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RouteTask
import typings.arcgisJsApi.esri.RouteTaskConstructor
import typings.arcgisJsApi.esri.RouteTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/RouteTask", JSImport.Namespace)
  @js.native
  val ^ : RouteTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/RouteTask", JSImport.Namespace)
  @js.native
  /**
    * Find routes between two or more locations and optionally get driving directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html)
    */
  class Class () extends RouteTask {
    def this(properties: RouteTaskProperties) = this()
  }
  
  type _To = RouteTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `routeTaskMod.foo` */
  override def _to: RouteTaskConstructor = ^
}
