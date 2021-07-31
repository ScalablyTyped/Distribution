package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentFollowupIntentInfo extends StObject {
  
  var followupIntentName: js.UndefOr[String] = js.undefined
  
  var parentFollowupIntentName: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentFollowupIntentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentFollowupIntentInfoMutableBuilder[Self <: GoogleCloudDialogflowV2IntentFollowupIntentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
    
    @scala.inline
    def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
  }
}
