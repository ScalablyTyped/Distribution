package typings.astTypes.anon

import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Readonly extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var optional: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  
  var readonly: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  
  var typeAnnotation: js.UndefOr[TSTypeKind | Null] = js.undefined
  
  var typeParameter: TSTypeParameterKind
}
object Readonly {
  
  inline def apply(typeParameter: TSTypeParameterKind): Readonly = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonly]
  }
  
  extension [Self <: Readonly](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setOptional(value: Boolean | Plussign | `-_`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setReadonly(value: Boolean | Plussign | `-_`): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setTypeAnnotation(value: TSTypeKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParameter(value: TSTypeParameterKind): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
