package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloorFilterViewModelProperties
  extends StObject
     with GoToProperties {
  
  /**
    * The currently selected facility.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#facility)
    */
  var facility: js.UndefOr[String] = js.undefined
  
  /**
    * The currently selected level.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#level)
    */
  var level: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the widget is expanded or collapsed.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#longNames)
    */
  var longNames: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The currently selected site.
    *
    * @default undefined
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#site)
    */
  var site: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object FloorFilterViewModelProperties {
  
  inline def apply(): FloorFilterViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloorFilterViewModelProperties]
  }
  
  extension [Self <: FloorFilterViewModelProperties](x: Self) {
    
    inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setFacilityUndefined: Self = StObject.set(x, "facility", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLongNames(value: Boolean): Self = StObject.set(x, "longNames", value.asInstanceOf[js.Any])
    
    inline def setLongNamesUndefined: Self = StObject.set(x, "longNames", js.undefined)
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
