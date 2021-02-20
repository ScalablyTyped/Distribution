package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSHasOptionalTypeAnnotationKind
import typings.astTypes.kindsMod.TSHasOptionalTypeParametersKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeParameters */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeAnnotation */
@js.native
trait TSFunctionType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeAnnotationKind
     with TSHasOptionalTypeParametersKind
     with TSTypeKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.TSFunctionType = js.native
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.native
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.native
}
object TSFunctionType {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSFunctionType")
  @js.native
  val ^ : Type[TSFunctionType] = js.native
  
  @scala.inline
  implicit class TSFunctionTypeMutableBuilder[Self <: TSFunctionType] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: (IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
