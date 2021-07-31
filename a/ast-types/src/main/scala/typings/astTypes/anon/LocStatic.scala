package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FunctionTypeAnnotationKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocStatic extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
  
  var value: FunctionTypeAnnotationKind
}
object LocStatic {
  
  @scala.inline
  def apply(value: FunctionTypeAnnotationKind): LocStatic = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocStatic]
  }
  
  @scala.inline
  implicit class LocStaticMutableBuilder[Self <: LocStatic] (val x: Self) extends AnyVal {
    
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
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setValue(value: FunctionTypeAnnotationKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
