package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaMeasurementAnalysis
  extends StObject
     with Accessor {
  
  /**
  		 * Polygon whose area is to be computed and displayed in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-AreaMeasurementAnalysis.html#geometry)
  		 */
  var geometry: Polygon = js.native
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the computed area in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-AreaMeasurementAnalysis.html#unit)
  		 */
  var unit: SystemOrAreaUnit = js.native
}
