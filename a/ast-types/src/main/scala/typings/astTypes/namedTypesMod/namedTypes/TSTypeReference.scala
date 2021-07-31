package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSHasOptionalTypeParameterInstantiationKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeParameterInstantiation */
trait TSTypeReference
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeParameterInstantiationKind
     with TSTypeKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.TSTypeReference
  
  var typeName: IdentifierKind | TSQualifiedNameKind
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.undefined
}
object TSTypeReference {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeReference")
  @js.native
  val ^ : Type[TSTypeReference] = js.native
  
  @scala.inline
  implicit class TSTypeReferenceMutableBuilder[Self <: TSTypeReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: IdentifierKind | TSQualifiedNameKind): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
