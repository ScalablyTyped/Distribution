package typings.angularCore.anon

import typings.std.Set
import typings.typescript.mod.AsExpression
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardRefs extends js.Object {
  var forwardRefs: Set[typings.typescript.mod.Identifier]
  var methodCalls: Set[CallExpression]
  var typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
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
}

