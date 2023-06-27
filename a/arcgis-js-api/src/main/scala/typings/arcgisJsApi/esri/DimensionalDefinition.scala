package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionalDefinition
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The dimension associated with the variable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
  		 */
  var dimensionName: String = js.native
  
  /**
  		 * Indicates whether the values indicate slices (rather than ranges).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
  		 */
  var isSlice: Boolean = js.native
  
  /**
  		 * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
  		 */
  var values: js.Array[Double | js.Array[Double]] = js.native
  
  /**
  		 * The required variable name by which to filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
  		 */
  var variableName: String = js.native
}
