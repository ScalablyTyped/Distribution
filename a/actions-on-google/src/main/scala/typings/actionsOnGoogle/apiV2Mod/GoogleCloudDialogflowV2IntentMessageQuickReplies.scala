package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageQuickReplies extends StObject {
  
  var quickReplies: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageQuickReplies {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageQuickReplies]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageQuickRepliesMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageQuickReplies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuickReplies(value: js.Array[String]): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    @scala.inline
    def setQuickRepliesVarargs(value: String*): Self = StObject.set(x, "quickReplies", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
