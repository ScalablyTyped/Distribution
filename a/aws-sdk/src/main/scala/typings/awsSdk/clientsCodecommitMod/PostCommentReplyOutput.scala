package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCommentReplyOutput extends StObject {
  
  /**
    * Information about the reply to a comment.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}
object PostCommentReplyOutput {
  
  inline def apply(): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
  
  extension [Self <: PostCommentReplyOutput](x: Self) {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
