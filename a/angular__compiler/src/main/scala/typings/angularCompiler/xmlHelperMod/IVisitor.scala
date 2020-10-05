package typings.angularCompiler.xmlHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVisitor extends js.Object {
  def visitDeclaration(decl: Declaration): js.Any = js.native
  def visitDoctype(doctype: Doctype): js.Any = js.native
  def visitTag(tag: Tag): js.Any = js.native
  def visitText(text: Text): js.Any = js.native
}

object IVisitor {
  @scala.inline
  def apply(
    visitDeclaration: Declaration => js.Any,
    visitDoctype: Doctype => js.Any,
    visitTag: Tag => js.Any,
    visitText: Text => js.Any
  ): IVisitor = {
    val __obj = js.Dynamic.literal(visitDeclaration = js.Any.fromFunction1(visitDeclaration), visitDoctype = js.Any.fromFunction1(visitDoctype), visitTag = js.Any.fromFunction1(visitTag), visitText = js.Any.fromFunction1(visitText))
    __obj.asInstanceOf[IVisitor]
  }
  @scala.inline
  implicit class IVisitorOps[Self <: IVisitor] (val x: Self) extends AnyVal {
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
    def setVisitDeclaration(value: Declaration => js.Any): Self = this.set("visitDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitDoctype(value: Doctype => js.Any): Self = this.set("visitDoctype", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitTag(value: Tag => js.Any): Self = this.set("visitTag", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitText(value: Text => js.Any): Self = this.set("visitText", js.Any.fromFunction1(value))
  }
  
}

