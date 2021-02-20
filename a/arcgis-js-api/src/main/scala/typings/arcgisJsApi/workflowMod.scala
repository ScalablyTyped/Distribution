package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Workflow
import typings.arcgisJsApi.esri.WorkflowConstructor
import typings.arcgisJsApi.esri.WorkflowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflowMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/Workflow", JSImport.Namespace)
  @js.native
  val ^ : WorkflowConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/Workflow", JSImport.Namespace)
  @js.native
  /**
    * A Workflow helps manage different stages of an [editing](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html)
    */
  class Class () extends Workflow {
    def this(properties: WorkflowProperties) = this()
  }
  
  type _To = WorkflowConstructor
  
  /* This means you don't have to write `^`, but can instead just say `workflowMod.foo` */
  override def _to: WorkflowConstructor = ^
}
