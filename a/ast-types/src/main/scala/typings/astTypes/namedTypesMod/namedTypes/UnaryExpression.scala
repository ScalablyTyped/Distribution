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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait UnaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var argument: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete = js.native
  
  var prefix: js.UndefOr[Boolean] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.UnaryExpression = js.native
}
object UnaryExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.UnaryExpression")
  @js.native
  val ^ : Type[UnaryExpression] = js.native
  
  @scala.inline
  implicit class UnaryExpressionMutableBuilder[Self <: UnaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: ExpressionKind): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOperator(value: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
