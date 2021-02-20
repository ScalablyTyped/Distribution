package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ServiceAreaTask
import typings.arcgisJsApi.esri.ServiceAreaTaskConstructor
import typings.arcgisJsApi.esri.ServiceAreaTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceAreaTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/ServiceAreaTask", JSImport.Namespace)
  @js.native
  val ^ : ServiceAreaTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/ServiceAreaTask", JSImport.Namespace)
  @js.native
  /**
    * ServiceAreaTask helps you find service areas around any location on a network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html)
    */
  class Class () extends ServiceAreaTask {
    def this(properties: ServiceAreaTaskProperties) = this()
  }
  
  type _To = ServiceAreaTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `serviceAreaTaskMod.foo` */
  override def _to: ServiceAreaTaskConstructor = ^
}
