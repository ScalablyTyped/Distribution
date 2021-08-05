package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait IfStatement
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var alternate: js.UndefOr[StatementKind | Null] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var consequent: StatementKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var test: ExpressionKind
  
  var `type`: typings.astTypes.astTypesStrings.IfStatement
}
object IfStatement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.IfStatement")
  @js.native
  val ^ : Type[IfStatement] = js.native
  
  extension [Self <: IfStatement](x: Self) {
    
    inline def setAlternate(value: StatementKind): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setConsequent(value: StatementKind): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setTest(value: ExpressionKind): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
