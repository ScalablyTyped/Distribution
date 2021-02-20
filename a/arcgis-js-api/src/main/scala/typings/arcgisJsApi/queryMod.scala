package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Query
import typings.arcgisJsApi.esri.QueryConstructor
import typings.arcgisJsApi.esri.QueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod extends Shortcut {
  
  @JSImport("esri/tasks/support/Query", JSImport.Namespace)
  @js.native
  val ^ : QueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/Query", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for executing queries for features from a layer or layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html)
    */
  class Class () extends Query {
    def this(properties: QueryProperties) = this()
  }
  
  type _To = QueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `queryMod.foo` */
  override def _to: QueryConstructor = ^
}
