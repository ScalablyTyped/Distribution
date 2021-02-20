package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSceneLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  
  /**
    * The id of the currently active filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId)
    */
  var activeFilterId: js.UndefOr[String] = js.native
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[BuildingSceneLayerElevationInfo] = js.native
  
  /**
    * Collection of filters that can be used to show or hide specific features in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters)
    */
  var filters: js.UndefOr[CollectionProperties[BuildingFilterProperties]] = js.native
  
  /**
    * An array of field names from the service to include with each feature in all sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
}
object BuildingSceneLayerProperties {
  
  @scala.inline
  def apply(): BuildingSceneLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingSceneLayerProperties]
  }
  
  @scala.inline
  implicit class BuildingSceneLayerPropertiesMutableBuilder[Self <: BuildingSceneLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveFilterId(value: String): Self = StObject.set(x, "activeFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveFilterIdUndefined: Self = StObject.set(x, "activeFilterId", js.undefined)
    
    @scala.inline
    def setElevationInfo(value: BuildingSceneLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    @scala.inline
    def setFilters(value: CollectionProperties[BuildingFilterProperties]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: BuildingFilterProperties*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value :_*))
  }
}
