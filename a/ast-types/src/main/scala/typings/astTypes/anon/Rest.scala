package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.FunctionTypeParamKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rest extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var params: js.Array[FunctionTypeParamKind]
  
  var rest: FunctionTypeParamKind | Null
  
  var returnType: FlowTypeKind
  
  var typeParameters: TypeParameterDeclarationKind | Null
}
object Rest {
  
  inline def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): Rest = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rest = null, typeParameters = null)
    __obj.asInstanceOf[Rest]
  }
  
  extension [Self <: Rest](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setParams(value: js.Array[FunctionTypeParamKind]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: FunctionTypeParamKind*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    inline def setRest(value: FunctionTypeParamKind): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestNull: Self = StObject.set(x, "rest", null)
    
    inline def setReturnType(value: FlowTypeKind): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
