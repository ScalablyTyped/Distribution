package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2PlaceValueSpecPlaceDialogSpec extends StObject {
  
  /**
    * This is the context for seeking permission to access various user related
    * data if the user prompts for personal location during the sub-dialog like
    * \"Home\", \"Work\" or \"Dad's house\". For example \"*To help you find
    * juice stores*, I just need to check your location. Can I get that from
    * Google?\". The first part of this permission prompt is configurable.
    */
  var permissionContext: js.UndefOr[String] = js.native
  
  /**
    * This is the initial prompt by AskForPlace sub-dialog. For example \"What
    * place do you want?\"
    */
  var requestPrompt: js.UndefOr[String] = js.native
}
object GoogleActionsV2PlaceValueSpecPlaceDialogSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2PlaceValueSpecPlaceDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpecPlaceDialogSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2PlaceValueSpecPlaceDialogSpecMutableBuilder[Self <: GoogleActionsV2PlaceValueSpecPlaceDialogSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionContext(value: String): Self = StObject.set(x, "permissionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionContextUndefined: Self = StObject.set(x, "permissionContext", js.undefined)
    
    @scala.inline
    def setRequestPrompt(value: String): Self = StObject.set(x, "requestPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPromptUndefined: Self = StObject.set(x, "requestPrompt", js.undefined)
  }
}
