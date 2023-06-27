package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFeaturesWorkflowData
  extends StObject
     with Accessor {
  
  /**
  		 * This provides the feature template and layer when creating a new feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflowData.html#creationInfo)
  		 */
  var creationInfo: CreationInfo = js.native
  
  /**
  		 * Returns a collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) representing features that have been created during the workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflowData.html#pendingFeatures)
  		 */
  var pendingFeatures: Collection[Graphic] = js.native
  
  /**
  		 * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflowData.html#viewModel)
  		 */
  var viewModel: EditorViewModel = js.native
}
