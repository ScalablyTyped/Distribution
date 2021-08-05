package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesStrings.Exclamationmark
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.Tilde
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.delete
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.void
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait UnaryExpression
  extends StObject
     with ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var argument: ExpressionKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  
  var prefix: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.UnaryExpression
}
object UnaryExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.UnaryExpression")
  @js.native
  val ^ : Type[UnaryExpression] = js.native
  
  extension [Self <: UnaryExpression](x: Self) {
    
    inline def setArgument(value: ExpressionKind): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setOperator(value: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
