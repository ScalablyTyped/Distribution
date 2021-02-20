package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.QueryTask
import typings.arcgisJsApi.esri.QueryTaskConstructor
import typings.arcgisJsApi.esri.QueryTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/QueryTask", JSImport.Namespace)
  @js.native
  val ^ : QueryTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/QueryTask", JSImport.Namespace)
  @js.native
  /**
    * Executes different types of query operations on a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html)
    */
  class Class () extends QueryTask {
    def this(properties: QueryTaskProperties) = this()
  }
  
  type _To = QueryTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `queryTaskMod.foo` */
  override def _to: QueryTaskConstructor = ^
}
