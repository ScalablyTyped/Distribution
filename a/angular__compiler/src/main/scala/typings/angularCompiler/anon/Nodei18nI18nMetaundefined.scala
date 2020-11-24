package typings.angularCompiler.anon

import typings.angularCompiler.i18nAstMod.I18nMeta
import typings.angularCompiler.r3AstMod.Visitor
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler.@angular/compiler/src/render3/r3_ast.Node & {  i18n :@angular/compiler.@angular/compiler/src/i18n/i18n_ast.I18nMeta | undefined} */
@js.native
trait Nodei18nI18nMetaundefined extends js.Object {
  
  var i18n: js.UndefOr[I18nMeta] = js.native
  
  var sourceSpan: ParseSourceSpan = js.native
  
  def visit[Result](visitor: Visitor[Result]): Result = js.native
}
object Nodei18nI18nMetaundefined {
  
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => js.Any): Nodei18nI18nMetaundefined = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Nodei18nI18nMetaundefined]
  }
  
  @scala.inline
  implicit class Nodei18nI18nMetaundefinedOps[Self <: Nodei18nI18nMetaundefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = this.set("sourceSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisit(value: Visitor[js.Any] => js.Any): Self = this.set("visit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setI18n(value: I18nMeta): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
  }
}
