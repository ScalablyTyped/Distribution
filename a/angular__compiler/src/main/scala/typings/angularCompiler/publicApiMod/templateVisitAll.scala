package typings.angularCompiler.publicApiMod

import typings.angularCompiler.templateAstMod.TemplateAst
import typings.angularCompiler.templateAstMod.TemplateAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "templateVisitAll")
@js.native
object templateVisitAll extends js.Object {
  def apply(visitor: TemplateAstVisitor, asts: js.Array[TemplateAst]): js.Array[_] = js.native
  def apply(visitor: TemplateAstVisitor, asts: js.Array[TemplateAst], context: js.Any): js.Array[_] = js.native
}

