package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClosestFacilityTask
import typings.arcgisJsApi.esri.ClosestFacilityTaskConstructor
import typings.arcgisJsApi.esri.ClosestFacilityTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestFacilityTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/ClosestFacilityTask", JSImport.Namespace)
  @js.native
  val ^ : ClosestFacilityTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/ClosestFacilityTask", JSImport.Namespace)
  @js.native
  /**
    * Helps you find closest facilities around any location (incident) on a network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html)
    */
  class Class () extends ClosestFacilityTask {
    def this(properties: ClosestFacilityTaskProperties) = this()
  }
  
  type _To = ClosestFacilityTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `closestFacilityTaskMod.foo` */
  override def _to: ClosestFacilityTaskConstructor = ^
}
