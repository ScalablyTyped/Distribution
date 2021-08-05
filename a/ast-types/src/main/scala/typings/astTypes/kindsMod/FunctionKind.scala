package typings.astTypes.kindsMod

import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typings.astTypes.namedTypesMod.namedTypes.ObjectMethod
  - typings.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
*/
trait FunctionKind extends StObject
object FunctionKind {
  
  inline def ArrowFunctionExpression(body: BlockStatementKind | ExpressionKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  inline def ClassMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind]
  ): typings.astTypes.namedTypesMod.namedTypes.ClassMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassMethod]
  }
  
  inline def ClassPrivateMethod(body: BlockStatementKind, key: PrivateNameKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  }
  
  inline def FunctionDeclaration(body: BlockStatementKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  }
  
  inline def FunctionExpression(body: BlockStatementKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  inline def ObjectMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind]
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  }
}
