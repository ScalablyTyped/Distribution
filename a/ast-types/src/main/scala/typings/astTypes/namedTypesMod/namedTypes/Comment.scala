package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment
  extends StObject
     with Printable {
  
  var leading: js.UndefOr[Boolean] = js.undefined
  
  var trailing: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object Comment {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Comment")
  @js.native
  val ^ : Type[Comment] = js.native
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
