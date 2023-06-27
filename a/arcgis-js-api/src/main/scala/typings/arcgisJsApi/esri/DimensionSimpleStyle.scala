package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionSimpleStyle
  extends StObject
     with Accessor {
  
  /**
  		 * Color of dimension lines.
  		 *
  		 * @default black
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * Size of text in dimension labels in points.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#fontSize)
  		 */
  var fontSize: Double = js.native
  
  /**
  		 * Width of dimension lines in points.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#lineSize)
  		 */
  var lineSize: Double = js.native
  
  /**
  		 * Background color of dimension labels.
  		 *
  		 * @default [255, 255, 255, 0.6]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#textBackgroundColor)
  		 */
  var textBackgroundColor: Color_ = js.native
  
  /**
  		 * Color of text in dimension labels.
  		 *
  		 * @default black
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionSimpleStyle.html#textColor)
  		 */
  var textColor: Color_ = js.native
  
  val `type`: simple = js.native
}
