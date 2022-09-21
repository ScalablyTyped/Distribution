package typings.angularCompilerCli.srcHostMod

import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.Statement
import typings.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDefinition extends StObject {
  
  /**
    * Statements of the function body, if a body is present, or null if no body is present or the
    * function is identified to represent a tslib helper function, in which case `helper` will
    * indicate which helper this function represents.
    *
    * This list may have been filtered to exclude statements which perform parameter default value
    * initialization.
    */
  var body: js.Array[Statement] | Null
  
  /**
    * A reference to the node which declares the function.
    */
  var node: MethodDeclaration | FunctionDeclaration | FunctionExpression | VariableDeclaration
  
  /**
    * Metadata regarding the function's parameters, including possible default value expressions.
    */
  var parameters: js.Array[Parameter]
}
object FunctionDefinition {
  
  inline def apply(
    node: MethodDeclaration | FunctionDeclaration | FunctionExpression | VariableDeclaration,
    parameters: js.Array[Parameter]
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], body = null)
    __obj.asInstanceOf[FunctionDefinition]
  }
  
  extension [Self <: FunctionDefinition](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setNode(value: MethodDeclaration | FunctionDeclaration | FunctionExpression | VariableDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
