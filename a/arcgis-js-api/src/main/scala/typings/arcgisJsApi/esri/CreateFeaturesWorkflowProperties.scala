package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`create-new`
import typings.arcgisJsApi.arcgisJsApiStrings.`update-pending`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeaturesWorkflowProperties
  extends StObject
     with WorkflowProperties {
  
  /**
    * Indicates the current feature state during creation.
    *
    * @default "create-new"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#createFeatureState)
    */
  var createFeatureState: js.UndefOr[`create-new` | `update-pending`] = js.undefined
  
  /**
    * Returns the number of pending features of an active [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#numPendingFeatures)
    */
  var numPendingFeatures: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns a collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) representing features that are currently pending in the active [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#pendingFeatures)
    */
  var pendingFeatures: js.UndefOr[CollectionProperties[GraphicProperties]] = js.undefined
}
object CreateFeaturesWorkflowProperties {
  
  inline def apply(): CreateFeaturesWorkflowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFeaturesWorkflowProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFeaturesWorkflowProperties] (val x: Self) extends AnyVal {
    
    inline def setCreateFeatureState(value: `create-new` | `update-pending`): Self = StObject.set(x, "createFeatureState", value.asInstanceOf[js.Any])
    
    inline def setCreateFeatureStateUndefined: Self = StObject.set(x, "createFeatureState", js.undefined)
    
    inline def setNumPendingFeatures(value: Double): Self = StObject.set(x, "numPendingFeatures", value.asInstanceOf[js.Any])
    
    inline def setNumPendingFeaturesUndefined: Self = StObject.set(x, "numPendingFeatures", js.undefined)
    
    inline def setPendingFeatures(value: CollectionProperties[GraphicProperties]): Self = StObject.set(x, "pendingFeatures", value.asInstanceOf[js.Any])
    
    inline def setPendingFeaturesUndefined: Self = StObject.set(x, "pendingFeatures", js.undefined)
    
    inline def setPendingFeaturesVarargs(value: GraphicProperties*): Self = StObject.set(x, "pendingFeatures", js.Array(value*))
  }
}
