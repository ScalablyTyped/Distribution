package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.EnumBooleanBodyKind
import typings.astTypes.kindsMod.EnumNumberBodyKind
import typings.astTypes.kindsMod.EnumStringBodyKind
import typings.astTypes.kindsMod.EnumSymbolBodyKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyCommentsIdLoc extends StObject {
  
  var body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: IdentifierKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}
object BodyCommentsIdLoc {
  
  @scala.inline
  def apply(
    body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind,
    id: IdentifierKind
  ): BodyCommentsIdLoc = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCommentsIdLoc]
  }
  
  @scala.inline
  implicit class BodyCommentsIdLocMutableBuilder[Self <: BodyCommentsIdLoc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
