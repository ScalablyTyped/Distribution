package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accessibility extends StObject {
  
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var key: LiteralKind | IdentifierKind | ExpressionKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var shorthand: js.UndefOr[Boolean] = js.undefined
  
  var value: ExpressionKind | PatternKind
}
object Accessibility {
  
  @scala.inline
  def apply(key: LiteralKind | IdentifierKind | ExpressionKind, value: ExpressionKind | PatternKind): Accessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessibility]
  }
  
  @scala.inline
  implicit class AccessibilityMutableBuilder[Self <: Accessibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: LiteralKind): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    @scala.inline
    def setKey(value: LiteralKind | IdentifierKind | ExpressionKind): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
    
    @scala.inline
    def setValue(value: ExpressionKind | PatternKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
