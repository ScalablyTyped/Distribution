package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckType extends StObject {
  
  var checkType: TSTypeKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var extendsType: TSTypeKind
  
  var falseType: TSTypeKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var trueType: TSTypeKind
}
object CheckType {
  
  inline def apply(checkType: TSTypeKind, extendsType: TSTypeKind, falseType: TSTypeKind, trueType: TSTypeKind): CheckType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckType]
  }
  
  extension [Self <: CheckType](x: Self) {
    
    inline def setCheckType(value: TSTypeKind): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setExtendsType(value: TSTypeKind): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: TSTypeKind): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setTrueType(value: TSTypeKind): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
  }
}
