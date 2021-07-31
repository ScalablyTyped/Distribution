package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StringLiteralKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdInitializer extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: IdentifierKind | StringLiteralKind
  
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}
object IdInitializer {
  
  @scala.inline
  def apply(id: IdentifierKind | StringLiteralKind): IdInitializer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdInitializer]
  }
  
  @scala.inline
  implicit class IdInitializerMutableBuilder[Self <: IdInitializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind | StringLiteralKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: ExpressionKind): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    @scala.inline
    def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
