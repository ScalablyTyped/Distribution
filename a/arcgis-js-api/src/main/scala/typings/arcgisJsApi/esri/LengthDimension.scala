package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.direct
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthDimension
  extends StObject
     with Accessor {
  
  /**
  		 * Ending point for the dimension.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint)
  		 */
  var endPoint: Point = js.native
  
  /**
  		 * The type of length that should be measured between the [startPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint) and [endPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint).
  		 *
  		 * @default "direct"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#measureType)
  		 */
  var measureType: direct | horizontal | vertical = js.native
  
  /**
  		 * Styling option that controls the shortest distance from the [startPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint) or [endPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#endPoint) to the dimension line in meters.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#offset)
  		 */
  var offset: Double = js.native
  
  /**
  		 * The orientation determines the relative direction the dimension line is extended to.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#orientation)
  		 */
  var orientation: Double = js.native
  
  /**
  		 * Starting point for the dimension.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LengthDimension.html#startPoint)
  		 */
  var startPoint: Point = js.native
}
