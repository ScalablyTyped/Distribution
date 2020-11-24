package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessibility extends js.Object {
  
  var accessibility: js.UndefOr[LiteralKind | Null] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var computed: js.UndefOr[Boolean] = js.native
  
  var key: LiteralKind | IdentifierKind | ExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var shorthand: js.UndefOr[Boolean] = js.native
  
  var value: ExpressionKind | PatternKind = js.native
}
object Accessibility {
  
  @scala.inline
  def apply(key: LiteralKind | IdentifierKind | ExpressionKind, value: ExpressionKind | PatternKind): Accessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessibility]
  }
  
  @scala.inline
  implicit class AccessibilityOps[Self <: Accessibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: LiteralKind | IdentifierKind | ExpressionKind): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ExpressionKind | PatternKind): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibility(value: LiteralKind): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setAccessibilityNull: Self = this.set("accessibility", null)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputed: Self = this.set("computed", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
    
    @scala.inline
    def setShorthand(value: Boolean): Self = this.set("shorthand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShorthand: Self = this.set("shorthand", js.undefined)
  }
}
