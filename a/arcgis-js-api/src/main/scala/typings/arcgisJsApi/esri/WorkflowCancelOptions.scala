package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowCancelOptions extends StObject {
  
  /**
  		 * The returned Error object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#cancel)
  		 */
  var error: js.UndefOr[Error] = js.undefined
  
  /**
  		 * Indicates whether to force cancel the active workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#cancel)
  		 */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display a prompt indicating canceling the active workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#cancel)
  		 */
  @JSName("notify")
  var notify_FWorkflowCancelOptions: js.UndefOr[Boolean] = js.undefined
}
object WorkflowCancelOptions {
  
  inline def apply(): WorkflowCancelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowCancelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowCancelOptions] (val x: Self) extends AnyVal {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
  }
}
