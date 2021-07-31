package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CreateWorkflow
import typings.arcgisJsApi.esri.CreateWorkflowConstructor
import typings.arcgisJsApi.esri.CreateWorkflowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createWorkflowMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/CreateWorkflow", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CreateWorkflowConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/CreateWorkflow", JSImport.Namespace)
  @js.native
  /**
    * A read-only class containing the logic used when creating features using the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html)
    */
  class Class ()
    extends StObject
       with CreateWorkflow {
    def this(properties: CreateWorkflowProperties) = this()
  }
  
  type _To = js.Object & CreateWorkflowConstructor
  
  /* This means you don't have to write `^`, but can instead just say `createWorkflowMod.foo` */
  override def _to: js.Object & CreateWorkflowConstructor = ^
}
