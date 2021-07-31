package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Await extends StObject {
  
  var await: js.UndefOr[Boolean] = js.undefined
  
  var body: StatementKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var left: VariableDeclarationKind | PatternKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var right: ExpressionKind
}
object Await {
  
  @scala.inline
  def apply(body: StatementKind, left: VariableDeclarationKind | PatternKind, right: ExpressionKind): Await = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Await]
  }
  
  @scala.inline
  implicit class AwaitMutableBuilder[Self <: Await] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitUndefined: Self = StObject.set(x, "await", js.undefined)
    
    @scala.inline
    def setBody(value: StatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: VariableDeclarationKind | PatternKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
