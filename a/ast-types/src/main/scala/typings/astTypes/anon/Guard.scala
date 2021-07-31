package typings.astTypes.anon

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guard extends StObject {
  
  var body: BlockStatementKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var guard: js.UndefOr[ExpressionKind | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var param: js.UndefOr[PatternKind | Null] = js.undefined
}
object Guard {
  
  @scala.inline
  def apply(body: BlockStatementKind): Guard = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guard]
  }
  
  @scala.inline
  implicit class GuardMutableBuilder[Self <: Guard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setGuard(value: ExpressionKind): Self = StObject.set(x, "guard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardNull: Self = StObject.set(x, "guard", null)
    
    @scala.inline
    def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setParam(value: PatternKind): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNull: Self = StObject.set(x, "param", null)
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
  }
}
