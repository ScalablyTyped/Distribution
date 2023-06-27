package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Workflow
import typings.arcgisJsApi.esri.WorkflowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorWorkflowMod {
  
  @JSImport("esri/widgets/Editor/Workflow", JSImport.Namespace)
  @js.native
  /**
  		 * The read-only `Workflow` class helps manage different stages of an [editing](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html)
  		 */
  open class ^ ()
    extends StObject
       with Workflow {
    def this(properties: WorkflowProperties) = this()
  }
}
