package typings.arcgisJsApi.esri

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
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurementAnalysisProperties extends StObject {
  
  /**
    * Polygon whose area is to be computed and displayed in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-AreaMeasurementAnalysis.html#geometry)
    */
  var geometry: js.UndefOr[PolygonProperties] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the computed area in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-AreaMeasurementAnalysis.html#unit)
    */
  var unit: js.UndefOr[
    imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
  ] = js.undefined
}
object AreaMeasurementAnalysisProperties {
  
  inline def apply(): AreaMeasurementAnalysisProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaMeasurementAnalysisProperties]
  }
  
  extension [Self <: AreaMeasurementAnalysisProperties](x: Self) {
    
    inline def setGeometry(value: PolygonProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setUnit(
      value: imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
