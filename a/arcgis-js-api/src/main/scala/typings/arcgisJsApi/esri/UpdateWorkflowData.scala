package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkflowData
  extends StObject
     with Accessor {
  
  /**
  		 * An array of features to be updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#candidates)
  		 */
  var candidates: js.Array[Graphic] = js.native
  
  /**
  		 * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflowData.html#viewModel)
  		 */
  var viewModel: EditorViewModel = js.native
}
