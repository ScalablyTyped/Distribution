package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VisualVariable
import typings.arcgisJsApi.esri.VisualVariableConstructor
import typings.arcgisJsApi.esri.VisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
  @js.native
  val ^ : VisualVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
  @js.native
  /**
    * The visual variable base class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html)
    */
  class Class () extends VisualVariable {
    def this(properties: VisualVariableProperties) = this()
  }
  
  type _To = VisualVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `visualVariableMod.foo` */
  override def _to: VisualVariableConstructor = ^
}
