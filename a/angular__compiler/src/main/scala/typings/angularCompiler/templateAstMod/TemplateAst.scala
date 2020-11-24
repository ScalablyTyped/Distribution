package typings.angularCompiler.templateAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateAst extends js.Object {
  
  /**
    * The source span from which this node was parsed.
    */
  var sourceSpan: ParseSourceSpan = js.native
  
  /**
    * Visit this node and possibly transform it.
    */
  def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}
object TemplateAst {
  
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: (TemplateAstVisitor, js.Any) => js.Any): TemplateAst = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[TemplateAst]
  }
  
  @scala.inline
  implicit class TemplateAstOps[Self <: TemplateAst] (val x: Self) extends AnyVal {
    
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
    def setVisit(value: (TemplateAstVisitor, js.Any) => js.Any): Self = this.set("visit", js.Any.fromFunction2(value))
  }
}
