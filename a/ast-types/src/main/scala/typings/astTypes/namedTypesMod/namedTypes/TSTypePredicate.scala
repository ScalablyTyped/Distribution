package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation, 'type' | 'typeAnnotation'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
trait TSTypePredicate
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeAnnotationKind
     with TSTypeKind {
  
  var asserts: js.UndefOr[Boolean] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var parameterName: IdentifierKind | TSThisTypeKind
  
  var `type`: typings.astTypes.astTypesStrings.TSTypePredicate
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.undefined
}
object TSTypePredicate {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypePredicate")
  @js.native
  val ^ : Type[TSTypePredicate] = js.native
  
  extension [Self <: TSTypePredicate](x: Self) {
    
    inline def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setParameterName(value: IdentifierKind | TSThisTypeKind): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
