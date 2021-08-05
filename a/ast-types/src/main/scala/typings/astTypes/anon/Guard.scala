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
  
  inline def apply(body: BlockStatementKind): Guard = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guard]
  }
  
  extension [Self <: Guard](x: Self) {
    
    inline def setBody(value: BlockStatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setGuard(value: ExpressionKind): Self = StObject.set(x, "guard", value.asInstanceOf[js.Any])
    
    inline def setGuardNull: Self = StObject.set(x, "guard", null)
    
    inline def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setParam(value: PatternKind): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamNull: Self = StObject.set(x, "param", null)
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
  }
}
