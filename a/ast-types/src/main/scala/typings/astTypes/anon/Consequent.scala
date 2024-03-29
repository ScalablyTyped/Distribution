package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consequent extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var consequent: js.Array[StatementKind]
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var test: ExpressionKind | Null
}
object Consequent {
  
  inline def apply(consequent: js.Array[StatementKind]): Consequent = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = null)
    __obj.asInstanceOf[Consequent]
  }
  
  extension [Self <: Consequent](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setConsequent(value: js.Array[StatementKind]): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setConsequentVarargs(value: StatementKind*): Self = StObject.set(x, "consequent", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setTest(value: ExpressionKind): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestNull: Self = StObject.set(x, "test", null)
  }
}
