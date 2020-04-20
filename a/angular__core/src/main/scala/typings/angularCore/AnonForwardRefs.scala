package typings.angularCore

import typings.std.Set
import typings.typescript.mod.AsExpression
import typings.typescript.mod.CallExpression
import typings.typescript.mod.Identifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardRefs extends js.Object {
  var forwardRefs: Set[Identifier]
  var methodCalls: Set[CallExpression]
  var typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
}

object AnonForwardRefs {
  @scala.inline
  def apply(
    forwardRefs: Set[Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
  ): AnonForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardRefs]
  }
}

