package typings.astTypes.anon

import typings.astTypes.astTypesStrings.`var`
import typings.astTypes.astTypesStrings.const
import typings.astTypes.astTypesStrings.let
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declarations extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var declarations: js.Array[VariableDeclaratorKind | IdentifierKind]
  
  var kind: `var` | let | const
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}
object Declarations {
  
  inline def apply(declarations: js.Array[VariableDeclaratorKind | IdentifierKind], kind: `var` | let | const): Declarations = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declarations]
  }
  
  extension [Self <: Declarations](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setDeclarations(value: js.Array[VariableDeclaratorKind | IdentifierKind]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: (VariableDeclaratorKind | IdentifierKind)*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    inline def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
