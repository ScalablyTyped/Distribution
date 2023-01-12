package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCommentOutput extends StObject {
  
  /**
    * Information about the updated comment.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}
object UpdateCommentOutput {
  
  inline def apply(): UpdateCommentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCommentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCommentOutput] (val x: Self) extends AnyVal {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
