package typings.angularCore.anon

import typings.std.Set
import typings.typescript.mod.AsExpression
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRefs extends js.Object {
  var forwardRefs: Set[typings.typescript.mod.Identifier] = js.native
  var methodCalls: Set[CallExpression] = js.native
  var typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression] = js.native
}

object ForwardRefs {
  @scala.inline
  def apply(
    forwardRefs: Set[typings.typescript.mod.Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
  ): ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefs]
  }
  @scala.inline
  implicit class ForwardRefsOps[Self <: ForwardRefs] (val x: Self) extends AnyVal {
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
    def setForwardRefs(value: Set[typings.typescript.mod.Identifier]): Self = this.set("forwardRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodCalls(value: Set[CallExpression]): Self = this.set("methodCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypedNodes(value: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]): Self = this.set("typedNodes", value.asInstanceOf[js.Any])
  }
  
}

