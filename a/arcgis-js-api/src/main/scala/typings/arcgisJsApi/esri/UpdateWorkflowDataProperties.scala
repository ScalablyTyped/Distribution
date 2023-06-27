package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowDataProperties extends StObject {
  
  /**
  		 * An array of features to be updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#candidates)
  		 */
  var candidates: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
  		 * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#viewModel)
  		 */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.undefined
}
object UpdateWorkflowDataProperties {
  
  inline def apply(): UpdateWorkflowDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkflowDataProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkflowDataProperties] (val x: Self) extends AnyVal {
    
    inline def setCandidates(value: js.Array[GraphicProperties]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    inline def setCandidatesUndefined: Self = StObject.set(x, "candidates", js.undefined)
    
    inline def setCandidatesVarargs(value: GraphicProperties*): Self = StObject.set(x, "candidates", js.Array(value*))
    
    inline def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
