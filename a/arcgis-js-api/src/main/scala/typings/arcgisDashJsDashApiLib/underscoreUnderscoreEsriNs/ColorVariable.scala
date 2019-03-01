package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorVariable extends VisualVariable {
  /**
    * Name of the numeric attribute field by which to normalize the data. If this field is used, then the values in [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#normalizationField)
    */
  var normalizationField: java.lang.String = js.native
  /**
    * An array of sequential objects, or stops, that defines a continuous color ramp. You must specify 2 - 8 stops. In most cases, no more than five are needed. Features with values that fall between the given stops will be assigned colors linearly interpolated along the ramp in relation to the nearest stop values. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops)
    */
  var stops: js.Array[ColorStop] = js.native
  /**
    * The visual variable type. For ColorVariable, this value is always `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#type)
    */
  @JSName("type")
  val type_ColorVariable: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.color = js.native
}

