package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quasi extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var quasi: TemplateLiteralKind
  
  var tag: ExpressionKind
}
object Quasi {
  
  inline def apply(quasi: TemplateLiteralKind, tag: ExpressionKind): Quasi = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quasi]
  }
  
  extension [Self <: Quasi](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setQuasi(value: TemplateLiteralKind): Self = StObject.set(x, "quasi", value.asInstanceOf[js.Any])
    
    inline def setTag(value: ExpressionKind): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
