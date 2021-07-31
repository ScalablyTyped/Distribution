package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Local extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var local: js.UndefOr[IdentifierKind | Null] = js.undefined
  
  var name: js.UndefOr[IdentifierKind | Null] = js.undefined
}
object Local {
  
  @scala.inline
  def apply(): Local = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Local]
  }
  
  @scala.inline
  implicit class LocalMutableBuilder[Self <: Local] (val x: Self) extends AnyVal {
    
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
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setLocal(value: IdentifierKind): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalNull: Self = StObject.set(x, "local", null)
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setName(value: IdentifierKind): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
