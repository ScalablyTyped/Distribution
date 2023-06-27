package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ExtentPropertiestypeexten
import typings.arcgisJsApi.anon.PolygonPropertiestypepoly
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-centimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-decimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-millimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAreaParametersProperties
  extends StObject
     with BaseImageMeasureParametersProperties {
  
  /**
  		 * The area unit used for an area calculation.
  		 *
  		 * @default "square-meters"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaParameters.html#areaUnit)
  		 */
  var areaUnit: js.UndefOr[
    `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
  ] = js.undefined
  
  /**
  		 * The extent or polygon geometry used to perform the area and perimeter measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaParameters.html#geometry)
  		 */
  var geometry: js.UndefOr[ExtentPropertiestypeexten | PolygonPropertiestypepoly] = js.undefined
  
  /**
  		 * When `true`, this method calculates the 3D measurements for the area and perimeter of a given geometry on an image service.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaParameters.html#is3D)
  		 */
  var is3D: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Linear unit used for a perimeter calculation.
  		 *
  		 * @default "meters"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaParameters.html#linearUnit)
  		 */
  var linearUnit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}
object ImageAreaParametersProperties {
  
  inline def apply(): ImageAreaParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAreaParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAreaParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setAreaUnit(
      value: `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
    ): Self = StObject.set(x, "areaUnit", value.asInstanceOf[js.Any])
    
    inline def setAreaUnitUndefined: Self = StObject.set(x, "areaUnit", js.undefined)
    
    inline def setGeometry(value: ExtentPropertiestypeexten | PolygonPropertiestypepoly): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setIs3D(value: Boolean): Self = StObject.set(x, "is3D", value.asInstanceOf[js.Any])
    
    inline def setIs3DUndefined: Self = StObject.set(x, "is3D", js.undefined)
    
    inline def setLinearUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "linearUnit", value.asInstanceOf[js.Any])
    
    inline def setLinearUnitUndefined: Self = StObject.set(x, "linearUnit", js.undefined)
  }
}
