package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.ChainElementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.MemberExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ChainElement, 'type'> */
trait MemberExpression
  extends StObject
     with ASTNode
     with ChainElementKind
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `object`: ExpressionKind
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var property: IdentifierKind | ExpressionKind
  
  var `type`: typings.astTypes.astTypesStrings.MemberExpression
}
object MemberExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.MemberExpression")
  @js.native
  val ^ : Type[MemberExpression] = js.native
  
  extension [Self <: MemberExpression](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setObject(value: ExpressionKind): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setProperty(value: IdentifierKind | ExpressionKind): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
