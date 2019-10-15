package typings.arcgisDashJsDashApi.esriRenderersVisualVariablesSizeVariableMod

import typings.arcgisDashJsDashApi.__esri.SizeVariable
import typings.arcgisDashJsDashApi.__esri.SizeVariableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
@js.native
/**
  * The size visual variable defines the size of individual features in a layer based on a numeric (often thematic) value. This value comes from one of the following:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html)
  */
class Class () extends SizeVariable {
  def this(properties: SizeVariableProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

