package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapFloorFilter extends StObject {
  
  /**
    * Indicates whether the FloorFilter is active and filtering the displayed content according to the [FloorFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html) selection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var enabled: Boolean
  
  /**
    * Contains the facility ID for the initially selected [facility](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#facility) in the floor filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var facility: String
  
  /**
    * Contains the level ID for the initially selected floor, which is used when filtering layers by their configured floor-aware properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var level: String
  
  /**
    * Indicates whether the levels list is showing the long names from longNameField.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var longNames: Boolean
  
  /**
    * Indicates whether the floor filter has been minimized to show only the levels list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var minimized: Boolean
  
  /**
    * Indicates whether the levels portion of the floor filter has been pinned to show the levels list.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var pinnedLevels: Boolean
  
  /**
    * Contains the site ID for the initially selected [site](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html#site) in the floor filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#FloorFilter)
    */
  var site: String
}
object WebMapFloorFilter {
  
  inline def apply(
    enabled: Boolean,
    facility: String,
    level: String,
    longNames: Boolean,
    minimized: Boolean,
    pinnedLevels: Boolean,
    site: String
  ): WebMapFloorFilter = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], facility = facility.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], longNames = longNames.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], pinnedLevels = pinnedLevels.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMapFloorFilter]
  }
  
  extension [Self <: WebMapFloorFilter](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFacility(value: String): Self = StObject.set(x, "facility", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLongNames(value: Boolean): Self = StObject.set(x, "longNames", value.asInstanceOf[js.Any])
    
    inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
    
    inline def setPinnedLevels(value: Boolean): Self = StObject.set(x, "pinnedLevels", value.asInstanceOf[js.Any])
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
  }
}
