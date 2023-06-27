package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionAnalysis
  extends StObject
     with Accessor {
  
  /**
  		 * A list of dimensions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionAnalysis.html#dimensions)
  		 */
  var dimensions: Collection[LengthDimension] = js.native
  
  /**
  		 * The style defines how the dimension objects of this analysis are displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionAnalysis.html#style)
  		 */
  var style: DimensionSimpleStyle = js.native
}
