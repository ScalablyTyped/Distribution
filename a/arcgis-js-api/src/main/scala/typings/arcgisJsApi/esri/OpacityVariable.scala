package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityVariable extends VisualVariable {
  /**
    * Name of the numeric attribute field by which to normalize the data. If this field is used, then the values in [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#normalizationField)
    */
  var normalizationField: String = js.native
  /**
    * An array of objects that defines the opacity to apply to features in a layer in a sequence of stops. You must specify 2 - 8 stops. In most cases, no more than five are needed. Features with data values that fall between the given stops will be assigned opacity values linearly interpolated along the ramp in relation to the stop values. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops)
    */
  var stops: js.Array[OpacityStop] = js.native
  /**
    * The visual variable type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#type)
    */
  @JSName("type")
  val type_OpacityVariable: typings.arcgisJsApi.arcgisJsApiStrings.opacity = js.native
}

