package typings.angularCore.anon

import typings.std.Set
import typings.typescript.mod.AsExpression
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRefs extends StObject {
  
  var forwardRefs: Set[typings.typescript.mod.Identifier] = js.native
  
  var methodCalls: Set[CallExpression] = js.native
  
  var typedNodes: Set[ParameterDeclaration | AsExpression | PropertyDeclaration] = js.native
}
object ForwardRefs {
  
  @scala.inline
  def apply(
    forwardRefs: Set[typings.typescript.mod.Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]
  ): ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefs]
  }
  
  @scala.inline
  implicit class ForwardRefsMutableBuilder[Self <: ForwardRefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardRefs(value: Set[typings.typescript.mod.Identifier]): Self = StObject.set(x, "forwardRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodCalls(value: Set[CallExpression]): Self = StObject.set(x, "methodCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedNodes(value: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]): Self = StObject.set(x, "typedNodes", value.asInstanceOf[js.Any])
  }
}
