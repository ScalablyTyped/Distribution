package typings.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisitor extends js.Object {
  def visitDeclaration(decl: Declaration): js.Any
  def visitDoctype(doctype: Doctype): js.Any
  def visitTag(tag: Tag): js.Any
  def visitText(text: Text): js.Any
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
}

