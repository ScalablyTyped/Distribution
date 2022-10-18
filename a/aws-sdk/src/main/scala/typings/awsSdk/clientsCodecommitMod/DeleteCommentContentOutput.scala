package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCommentContentOutput extends StObject {
  
  /**
    * Information about the comment you just deleted.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}
object DeleteCommentContentOutput {
  
  inline def apply(): DeleteCommentContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCommentContentOutput]
  }
  
  extension [Self <: DeleteCommentContentOutput](x: Self) {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
