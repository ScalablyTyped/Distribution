package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.DeclareClassKind
import typings.astTypes.kindsMod.DeclareFunctionKind
import typings.astTypes.kindsMod.DeclareOpaqueTypeKind
import typings.astTypes.kindsMod.DeclareVariableKind
import typings.astTypes.kindsMod.ExportBatchSpecifierKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.InterfaceDeclarationKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TypeAliasKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait DeclareExportDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var default: Boolean = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | TypeAliasKind | DeclareOpaqueTypeKind | InterfaceDeclarationKind | Null = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var source: js.UndefOr[LiteralKind | Null] = js.native
  
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.DeclareExportDeclaration = js.native
}
object DeclareExportDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareExportDeclaration")
  @js.native
  val ^ : Type[DeclareExportDeclaration] = js.native
  
  @scala.inline
  implicit class DeclareExportDeclarationMutableBuilder[Self <: DeclareExportDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDeclaration(
      value: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | TypeAliasKind | DeclareOpaqueTypeKind | InterfaceDeclarationKind
    ): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSource(value: LiteralKind): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersUndefined: Self = StObject.set(x, "specifiers", js.undefined)
    
    @scala.inline
    def setSpecifiersVarargs(value: (ExportSpecifierKind | ExportBatchSpecifierKind)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.DeclareExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
