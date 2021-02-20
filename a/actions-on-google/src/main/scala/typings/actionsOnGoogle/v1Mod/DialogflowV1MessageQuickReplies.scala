package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageQuickReplies
  extends DialogflowV1BaseMessage[`2`]
     with DialogflowV1Message {
  
  var replies: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DialogflowV1MessageQuickReplies {
  
  @scala.inline
  def apply(): DialogflowV1MessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageQuickReplies]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageQuickRepliesMutableBuilder[Self <: DialogflowV1MessageQuickReplies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplies(value: js.Array[String]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: String*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
