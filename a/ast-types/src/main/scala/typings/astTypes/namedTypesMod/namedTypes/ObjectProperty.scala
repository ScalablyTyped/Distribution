package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait ObjectProperty
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var key: LiteralKind | IdentifierKind | ExpressionKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var shorthand: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ObjectProperty
  
  var value: ExpressionKind | PatternKind
}
object ObjectProperty {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectProperty")
  @js.native
  val ^ : Type[ObjectProperty] = js.native
  
  extension [Self <: ObjectProperty](x: Self) {
    
    inline def setAccessibility(value: LiteralKind): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setKey(value: LiteralKind | IdentifierKind | ExpressionKind): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.ObjectProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ExpressionKind | PatternKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
