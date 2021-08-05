package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.planar
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreasAndLengthsParametersProperties extends StObject {
  
  /**
    * The area unit in which areas of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    acres | hectares | `square-miles` | `square-kilometers` | `square-meters` | `square-feet` | `square-yards`
  ] = js.undefined
  
  /**
    * Defines the type of calculation for the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#calculationType)
    */
  var calculationType: js.UndefOr[planar | geodesic | `preserve-shape`] = js.undefined
  
  /**
    * The length unit in which perimeters of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.undefined
  
  /**
    * Polygon geometries for which to compute areas and lengths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#polygons)
    */
  var polygons: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
}
object AreasAndLengthsParametersProperties {
  
  inline def apply(): AreasAndLengthsParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreasAndLengthsParametersProperties]
  }
  
  extension [Self <: AreasAndLengthsParametersProperties](x: Self) {
    
    inline def setAreaUnit(
      value: acres | hectares | `square-miles` | `square-kilometers` | `square-meters` | `square-feet` | `square-yards`
    ): Self = StObject.set(x, "areaUnit", value.asInstanceOf[js.Any])
    
    inline def setAreaUnitUndefined: Self = StObject.set(x, "areaUnit", js.undefined)
    
    inline def setCalculationType(value: planar | geodesic | `preserve-shape`): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setCalculationTypeUndefined: Self = StObject.set(x, "calculationType", js.undefined)
    
    inline def setLengthUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "lengthUnit", value.asInstanceOf[js.Any])
    
    inline def setLengthUnitUndefined: Self = StObject.set(x, "lengthUnit", js.undefined)
    
    inline def setPolygons(value: js.Array[PolygonProperties]): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsUndefined: Self = StObject.set(x, "polygons", js.undefined)
    
    inline def setPolygonsVarargs(value: PolygonProperties*): Self = StObject.set(x, "polygons", js.Array(value :_*))
  }
}
