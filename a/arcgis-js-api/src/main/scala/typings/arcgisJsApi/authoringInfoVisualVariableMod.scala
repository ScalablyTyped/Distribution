package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AuthoringInfoVisualVariable
import typings.arcgisJsApi.esri.AuthoringInfoVisualVariableConstructor
import typings.arcgisJsApi.esri.AuthoringInfoVisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authoringInfoVisualVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/support/AuthoringInfoVisualVariable", JSImport.Namespace)
  @js.native
  val ^ : AuthoringInfoVisualVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/AuthoringInfoVisualVariable", JSImport.Namespace)
  @js.native
  class Class () extends AuthoringInfoVisualVariable {
    def this(properties: AuthoringInfoVisualVariableProperties) = this()
  }
  
  type _To = AuthoringInfoVisualVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `authoringInfoVisualVariableMod.foo` */
  override def _to: AuthoringInfoVisualVariableConstructor = ^
}
