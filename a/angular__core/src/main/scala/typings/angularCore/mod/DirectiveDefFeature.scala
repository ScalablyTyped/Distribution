package typings.angularCore.mod

import typings.angularCore.angularCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveDefFeature extends js.Object {
  
  def apply[T](directiveDef: ɵDirectiveDef[T]): Unit = js.native
  
  /**
    * Marks a feature as something that {@link InheritDefinitionFeature} will execute
    * during inheritance.
    *
    * NOTE: DO NOT SET IN ROOT OF MODULE! Doing so will result in tree-shakers/bundlers
    * identifying the change as a side effect, and the feature will be included in
    * every bundle.
    */
  var ngInherit: js.UndefOr[`true`] = js.native
}
