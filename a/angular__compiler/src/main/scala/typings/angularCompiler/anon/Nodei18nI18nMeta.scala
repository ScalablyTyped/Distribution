package typings.angularCompiler.anon

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.r3AstMod.Visitor
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @angular/compiler.@angular/compiler/src/render3/r3_ast.Node & {  i18n ? :@angular/compiler.@angular/compiler/src/i18n/i18n_ast.I18nMeta} */
trait Nodei18nI18nMeta extends js.Object {
  var i18n: js.UndefOr[I18nMeta] = js.undefined
  var sourceSpan: ParseSourceSpan
  def visit[Result](visitor: Visitor[Result]): Result
}

object Nodei18nI18nMeta {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => js.Any, i18n: I18nMeta = null): Nodei18nI18nMeta = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodei18nI18nMeta]
  }
}

