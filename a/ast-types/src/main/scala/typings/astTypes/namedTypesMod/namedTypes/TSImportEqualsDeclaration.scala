package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TSExternalModuleReferenceKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
trait TSImportEqualsDeclaration
  extends StObject
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: IdentifierKind
  
  var isExport: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
  
  var `type`: typings.astTypes.astTypesStrings.TSImportEqualsDeclaration
}
object TSImportEqualsDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSImportEqualsDeclaration")
  @js.native
  val ^ : Type[TSImportEqualsDeclaration] = js.native
  
  @scala.inline
  implicit class TSImportEqualsDeclarationMutableBuilder[Self <: TSImportEqualsDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExport(value: Boolean): Self = StObject.set(x, "isExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExportUndefined: Self = StObject.set(x, "isExport", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setModuleReference(value: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind): Self = StObject.set(x, "moduleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.TSImportEqualsDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
