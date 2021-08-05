package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesStrings.`type`
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.value
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ImportDefaultSpecifierKind
import typings.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typings.astTypes.kindsMod.ImportSpecifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
trait ImportDeclaration
  extends StObject
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var importKind: js.UndefOr[value | `type` | typeof] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var source: LiteralKind
  
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ImportDeclaration
}
object ImportDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ImportDeclaration")
  @js.native
  val ^ : Type[ImportDeclaration] = js.native
  
  extension [Self <: ImportDeclaration](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setImportKind(value: value | `type` | typeof): Self = StObject.set(x, "importKind", value.asInstanceOf[js.Any])
    
    inline def setImportKindUndefined: Self = StObject.set(x, "importKind", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setSource(value: LiteralKind): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpecifiers(value: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersUndefined: Self = StObject.set(x, "specifiers", js.undefined)
    
    inline def setSpecifiersVarargs(value: (ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    inline def setType(value: typings.astTypes.astTypesStrings.ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
