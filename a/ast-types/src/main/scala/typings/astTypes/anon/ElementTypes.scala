package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSNamedTupleMemberKind
import typings.astTypes.kindsMod.TSTypeKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementTypes extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}
object ElementTypes {
  
  @scala.inline
  def apply(elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]): ElementTypes = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTypes]
  }
  
  @scala.inline
  implicit class ElementTypesMutableBuilder[Self <: ElementTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setElementTypes(value: js.Array[TSTypeKind | TSNamedTupleMemberKind]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTypesVarargs(value: (TSTypeKind | TSNamedTupleMemberKind)*): Self = StObject.set(x, "elementTypes", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
