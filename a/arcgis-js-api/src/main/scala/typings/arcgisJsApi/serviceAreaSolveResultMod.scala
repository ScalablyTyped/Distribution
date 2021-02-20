package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ServiceAreaSolveResult
import typings.arcgisJsApi.esri.ServiceAreaSolveResultConstructor
import typings.arcgisJsApi.esri.ServiceAreaSolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceAreaSolveResultMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ServiceAreaSolveResult", JSImport.Namespace)
  @js.native
  val ^ : ServiceAreaSolveResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ServiceAreaSolveResult", JSImport.Namespace)
  @js.native
  /**
    * The result from [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html)
    */
  class Class () extends ServiceAreaSolveResult {
    def this(properties: ServiceAreaSolveResultProperties) = this()
  }
  
  type _To = ServiceAreaSolveResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `serviceAreaSolveResultMod.foo` */
  override def _to: ServiceAreaSolveResultConstructor = ^
}
