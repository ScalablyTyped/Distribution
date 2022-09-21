package typings.angularCompilerCli

import typings.typescript.mod.CallExpression
import typings.typescript.mod.EntityName
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeQueryNode
import typings.typescript.mod.VariableStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/ts_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAccessExpression(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tsCallMethod(receiver: Expression, methodName: String): CallExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallMethod")(receiver.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[CallExpression]
  inline def tsCallMethod(receiver: Expression, methodName: String, args: js.Array[Expression]): CallExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCallMethod")(receiver.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[CallExpression]
  
  inline def tsCastToAny(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("tsCastToAny")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def tsCreateElement(tagName: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("tsCreateElement")(tagName.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def tsCreateTypeQueryForCoercedInput(typeName: EntityName, coercedInputName: String): TypeQueryNode = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCreateTypeQueryForCoercedInput")(typeName.asInstanceOf[js.Any], coercedInputName.asInstanceOf[js.Any])).asInstanceOf[TypeQueryNode]
  
  inline def tsCreateVariable(id: Identifier, initializer: Expression): VariableStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("tsCreateVariable")(id.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[VariableStatement]
  
  inline def tsDeclareVariable(id: Identifier, `type`: TypeNode): VariableStatement = (^.asInstanceOf[js.Dynamic].applyDynamic("tsDeclareVariable")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[VariableStatement]
}
