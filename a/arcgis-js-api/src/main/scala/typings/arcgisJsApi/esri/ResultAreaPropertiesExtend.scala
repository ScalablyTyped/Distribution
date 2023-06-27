package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.buffer
import typings.arcgisJsApi.arcgisJsApiStrings.convexhull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultAreaPropertiesExtend extends StObject {
  
  /**
  		 * Units for area measurements.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ResultAreaPropertiesExtend)
  		 */
  var areaUnit: AreaUnits
  
  /**
  		 * The color for the result area graphic.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ResultAreaPropertiesExtend)
  		 */
  var color: GraphicColor
  
  /**
  		 * The buffer or padding added to the result area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ResultAreaPropertiesExtend)
  		 */
  var distance: Double
  
  /**
  		 * Determines if the area is shown on the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ResultAreaPropertiesExtend)
  		 */
  var show: Boolean
  
  /**
  		 * The geometry of the result area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ResultAreaPropertiesExtend)
  		 */
  var `type`: buffer | convexhull
  
  /**
  		 * Units for linear measurements.
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: LinearUnits
}
object ResultAreaPropertiesExtend {
  
  inline def apply(
    areaUnit: AreaUnits,
    color: GraphicColor,
    distance: Double,
    show: Boolean,
    `type`: buffer | convexhull,
    unit: LinearUnits
  ): ResultAreaPropertiesExtend = {
    val __obj = js.Dynamic.literal(areaUnit = areaUnit.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultAreaPropertiesExtend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultAreaPropertiesExtend] (val x: Self) extends AnyVal {
    
    inline def setAreaUnit(value: AreaUnits): Self = StObject.set(x, "areaUnit", value.asInstanceOf[js.Any])
    
    inline def setColor(value: GraphicColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setType(value: buffer | convexhull): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: LinearUnits): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
