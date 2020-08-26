package typings.angularCompiler.templateMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3AstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "prepareEventListenerParameters")
@js.native
object prepareEventListenerParameters extends js.Object {
  def apply(eventAst: BoundEvent): js.Array[Expression] = js.native
  def apply(eventAst: BoundEvent, handlerName: js.UndefOr[scala.Nothing], scope: BindingScope): js.Array[Expression] = js.native
  def apply(eventAst: BoundEvent, handlerName: String): js.Array[Expression] = js.native
  def apply(eventAst: BoundEvent, handlerName: String, scope: BindingScope): js.Array[Expression] = js.native
  def apply(eventAst: BoundEvent, handlerName: Null, scope: BindingScope): js.Array[Expression] = js.native
}

