package typings.angularCore.anon

import typings.std.Set
import typings.typescript.mod.AsExpression
import typings.typescript.mod.CallExpression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardRefs extends StObject {
  
  var forwardRefs: Set[typings.typescript.mod.Identifier]
  
  var methodCalls: Set[CallExpression]
  
  var typedNodes: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]
}
object ForwardRefs {
  
  inline def apply(
    forwardRefs: Set[typings.typescript.mod.Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]
  ): ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefs]
  }
  
  extension [Self <: ForwardRefs](x: Self) {
    
    inline def setForwardRefs(value: Set[typings.typescript.mod.Identifier]): Self = StObject.set(x, "forwardRefs", value.asInstanceOf[js.Any])
    
    inline def setMethodCalls(value: Set[CallExpression]): Self = StObject.set(x, "methodCalls", value.asInstanceOf[js.Any])
    
    inline def setTypedNodes(value: Set[ParameterDeclaration | AsExpression | PropertyDeclaration]): Self = StObject.set(x, "typedNodes", value.asInstanceOf[js.Any])
  }
}
