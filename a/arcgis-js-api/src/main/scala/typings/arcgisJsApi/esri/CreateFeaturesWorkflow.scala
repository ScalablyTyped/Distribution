package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`create-new`
import typings.arcgisJsApi.arcgisJsApiStrings.`update-pending`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFeaturesWorkflow
  extends StObject
     with Workflow {
  
  /**
    * Indicates the current feature state during creation.
    *
    * @default "create-new"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#createFeatureState)
    */
  var createFeatureState: `create-new` | `update-pending` = js.native
  
  /**
    * Returns the number of pending features of an active [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#numPendingFeatures)
    */
  var numPendingFeatures: Double = js.native
  
  /**
    * Returns a collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) representing features that are currently pending in the active [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#pendingFeatures)
    */
  var pendingFeatures: Collection[Graphic] = js.native
  
  /**
    * Moves the pending feature into update mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html#updatePendingFeature)
    */
  def updatePendingFeature(feature: Graphic): js.Promise[scala.Unit] = js.native
}
