package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UpdateWorkflow
import typings.arcgisJsApi.esri.UpdateWorkflowConstructor
import typings.arcgisJsApi.esri.UpdateWorkflowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateWorkflowMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/UpdateWorkflow", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UpdateWorkflowConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/UpdateWorkflow", JSImport.Namespace)
  @js.native
  /**
    * A read-only class containing the logic used when updating and/or deleting features using the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html)
    */
  open class Class ()
    extends StObject
       with UpdateWorkflow {
    def this(properties: UpdateWorkflowProperties) = this()
  }
  
  type _To = js.Object & UpdateWorkflowConstructor
  
  /* This means you don't have to write `^`, but can instead just say `updateWorkflowMod.foo` */
  override def _to: js.Object & UpdateWorkflowConstructor = ^
}
