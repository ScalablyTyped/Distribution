package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeColorInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The color used to render dots representing the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#field) in a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) or the color used to represent a pie chart slice in a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The name of the numeric attribute field represented by the given [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#color).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#field)
  		 */
  var field: String = js.native
  
  /**
  		 * The label used to describe the field or attribute in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#label)
  		 */
  var label: String = js.native
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpression)
  		 */
  var valueExpression: String = js.native
  
  /**
  		 * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpression) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AttributeColorInfo.html#valueExpressionTitle)
  		 */
  var valueExpressionTitle: String = js.native
}
