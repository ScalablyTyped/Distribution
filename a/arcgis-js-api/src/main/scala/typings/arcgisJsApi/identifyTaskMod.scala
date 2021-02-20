package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.IdentifyTask
import typings.arcgisJsApi.esri.IdentifyTaskConstructor
import typings.arcgisJsApi.esri.IdentifyTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifyTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/IdentifyTask", JSImport.Namespace)
  @js.native
  val ^ : IdentifyTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/IdentifyTask", JSImport.Namespace)
  @js.native
  /**
    * Performs an identify operation on the layers of a map service exposed by the ArcGIS Server REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html)
    */
  class Class () extends IdentifyTask {
    def this(properties: IdentifyTaskProperties) = this()
  }
  
  type _To = IdentifyTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `identifyTaskMod.foo` */
  override def _to: IdentifyTaskConstructor = ^
}
