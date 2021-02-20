package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckType extends StObject {
  
  var checkType: TSTypeKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var extendsType: TSTypeKind = js.native
  
  var falseType: TSTypeKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var trueType: TSTypeKind = js.native
}
object CheckType {
  
  @scala.inline
  def apply(checkType: TSTypeKind, extendsType: TSTypeKind, falseType: TSTypeKind, trueType: TSTypeKind): CheckType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckType]
  }
  
  @scala.inline
  implicit class CheckTypeMutableBuilder[Self <: CheckType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckType(value: TSTypeKind): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExtendsType(value: TSTypeKind): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseType(value: TSTypeKind): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setTrueType(value: TSTypeKind): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
  }
}
