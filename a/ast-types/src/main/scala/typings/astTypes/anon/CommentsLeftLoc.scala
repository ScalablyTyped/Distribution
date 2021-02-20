package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsLeftLoc extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var left: IdentifierKind | TSQualifiedNameKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var right: IdentifierKind | TSQualifiedNameKind = js.native
}
object CommentsLeftLoc {
  
  @scala.inline
  def apply(left: IdentifierKind | TSQualifiedNameKind, right: IdentifierKind | TSQualifiedNameKind): CommentsLeftLoc = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsLeftLoc]
  }
  
  @scala.inline
  implicit class CommentsLeftLocMutableBuilder[Self <: CommentsLeftLoc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: IdentifierKind | TSQualifiedNameKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setRight(value: IdentifierKind | TSQualifiedNameKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
