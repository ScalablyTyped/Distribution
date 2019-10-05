package typings.arcgisDashJsDashApi.esriRenderersVisualVariablesOpacityVariableMod

import typings.arcgisDashJsDashApi.__esri.OpacityVariable
import typings.arcgisDashJsDashApi.__esri.OpacityVariableProperties
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
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

