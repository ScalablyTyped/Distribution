package typings.atAngularCore

import typings.std.Set
import typings.typescript.typescriptMod.AsExpression
import typings.typescript.typescriptMod.CallExpression
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardRefs extends js.Object {
  var forwardRefs: Set[Identifier]
  var methodCalls: Set[CallExpression]
  var typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
}

object Anon_ForwardRefs {
  @scala.inline
  def apply(
    forwardRefs: Set[Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
  ): Anon_ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ForwardRefs]
  }
}

