package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.OpaqueTypeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.OpaqueType, 'type' | 'impltype'> */
trait DeclareOpaqueType
  extends StObject
     with ASTNode
     with DeclarationKind
     with NodeKind
     with OpaqueTypeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: IdentifierKind
  
  var impltype: FlowTypeKind | Null
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var supertype: js.UndefOr[FlowTypeKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.DeclareOpaqueType
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | Null] = js.undefined
}
object DeclareOpaqueType {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareOpaqueType")
  @js.native
  val ^ : Type[DeclareOpaqueType] = js.native
  
  @scala.inline
  implicit class DeclareOpaqueTypeMutableBuilder[Self <: DeclareOpaqueType] (val x: Self) extends AnyVal {
    
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
    def setImpltype(value: FlowTypeKind): Self = StObject.set(x, "impltype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpltypeNull: Self = StObject.set(x, "impltype", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSupertype(value: FlowTypeKind): Self = StObject.set(x, "supertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertypeNull: Self = StObject.set(x, "supertype", null)
    
    @scala.inline
    def setSupertypeUndefined: Self = StObject.set(x, "supertype", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
