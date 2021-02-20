package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OpacityVariable
import typings.arcgisJsApi.esri.OpacityVariableConstructor
import typings.arcgisJsApi.esri.OpacityVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opacityVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/OpacityVariable", JSImport.Namespace)
  @js.native
  val ^ : OpacityVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/OpacityVariable", JSImport.Namespace)
  @js.native
  /**
    * The opacity visual variable defines the opacity of each feature's symbol based on a numeric [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#field) value or number returned from an [expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html)
    */
  class Class () extends OpacityVariable {
    def this(properties: OpacityVariableProperties) = this()
  }
  
  type _To = OpacityVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `opacityVariableMod.foo` */
  override def _to: OpacityVariableConstructor = ^
}
