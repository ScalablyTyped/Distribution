package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSceneLayer
  extends StObject
     with Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer
     with APIKeyMixin {
  
  /**
    * The id of the currently active filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId)
    */
  var activeFilterId: String = js.native
  
  /**
    * A flat [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of all the [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#sublayers) in the BuildingSublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#allSublayers)
    */
  val allSublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var elevationInfo: BuildingSceneLayerElevationInfo = js.native
  
  /**
    * Collection of filters that can be used to show or hide specific features in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters)
    */
  var filters: Collection[BuildingFilter] = js.native
  
  /**
    * Loads the layer and all of its sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#loadAll)
    */
  def loadAll(): js.Promise[BuildingSceneLayer] = js.native
  
  /**
    * An array of field names from the service to include with each feature in all sublayers.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  
  /**
    * Hierarchical structure of sublayers in a BuildingSceneLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#sublayers)
    */
  val sublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  
  /**
    * Summary statistics for all component layers in the building scene layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#summaryStatistics)
    */
  val summaryStatistics: BuildingSummaryStatistics = js.native
  
  @JSName("type")
  val type_BuildingSceneLayer: `building-scene` = js.native
}
