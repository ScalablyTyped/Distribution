package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.SwitchCaseKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait SwitchStatement
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var cases: js.Array[SwitchCaseKind]
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var discriminant: ExpressionKind
  
  var lexical: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.SwitchStatement
}
object SwitchStatement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.SwitchStatement")
  @js.native
  val ^ : Type[SwitchStatement] = js.native
  
  extension [Self <: SwitchStatement](x: Self) {
    
    inline def setCases(value: js.Array[SwitchCaseKind]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: SwitchCaseKind*): Self = StObject.set(x, "cases", js.Array(value :_*))
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setDiscriminant(value: ExpressionKind): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    inline def setLexical(value: Boolean): Self = StObject.set(x, "lexical", value.asInstanceOf[js.Any])
    
    inline def setLexicalUndefined: Self = StObject.set(x, "lexical", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.SwitchStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
