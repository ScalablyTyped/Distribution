package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.OpacityVariableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.OpacityVariable")
@js.native
/**
  * The opacity visual variable defines the opacity of each feature's symbol based on a numeric [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#field) value or number returned from an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#valueExpression). You must specify [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops) to construct the opacity ramp.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html)
  */
class OpacityVariableCls ()
  extends typings.arcgisJsApi.esri.OpacityVariable {
  def this(properties: OpacityVariableProperties) = this()
}

