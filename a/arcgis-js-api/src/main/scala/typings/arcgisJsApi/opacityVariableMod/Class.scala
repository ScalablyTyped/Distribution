package typings.arcgisJsApi.opacityVariableMod

import typings.arcgisJsApi.esri.OpacityVariable
import typings.arcgisJsApi.esri.OpacityVariableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/visualVariables/OpacityVariable", JSImport.Namespace)
@js.native
/**
  * The opacity visual variable defines the opacity of each feature's symbol based on a numeric [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#field) value or number returned from an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#valueExpression). You must specify [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops) to construct the opacity ramp.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html)
  */
class Class () extends OpacityVariable {
  def this(properties: OpacityVariableProperties) = this()
}

