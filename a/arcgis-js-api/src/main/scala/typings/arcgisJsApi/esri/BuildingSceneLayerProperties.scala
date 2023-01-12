package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingSceneLayerProperties
  extends StObject
     with LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with APIKeyMixinProperties {
  
  /**
    * The id of the currently active filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId)
    */
  var activeFilterId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how features are placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[BuildingSceneLayerElevationInfo] = js.undefined
  
  /**
    * Collection of filters that can be used to show or hide specific features in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters)
    */
  var filters: js.UndefOr[CollectionProperties[BuildingFilterProperties]] = js.undefined
  
  /**
    * An array of field names from the service to include with each feature in all sublayers.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
}
object BuildingSceneLayerProperties {
  
  inline def apply(): BuildingSceneLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingSceneLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingSceneLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveFilterId(value: String): Self = StObject.set(x, "activeFilterId", value.asInstanceOf[js.Any])
    
    inline def setActiveFilterIdUndefined: Self = StObject.set(x, "activeFilterId", js.undefined)
    
    inline def setElevationInfo(value: BuildingSceneLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setFilters(value: CollectionProperties[BuildingFilterProperties]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: BuildingFilterProperties*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
  }
}
