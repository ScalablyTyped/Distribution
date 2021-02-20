package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2LinkValueSpecLinkDialogSpec extends StObject {
  
  /**
    * The name of the app or site this request wishes to linking to.
    * The TTS will be created with the title \"Open <destination_name>\". Also
    * used during confirmation, \"Can I send you to <destination_name>?\" If we
    * know the actual title of the link that is being handed off to, we will
    * ignore this field and use the appropriate title.
    * Max 20 chars.
    */
  var destinationName: js.UndefOr[String] = js.native
  
  /**
    * A string that is added to the end of the confirmation prompt to explain
    * why we need to link out. Example: \"navigate to pick up your coffee?\" This
    * can be appended to the confirmation prompt like \"Can I send you to Google
    * Maps to navigate to pick up your coffee?\"
    */
  var requestLinkReason: js.UndefOr[String] = js.native
}
object GoogleActionsV2LinkValueSpecLinkDialogSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2LinkValueSpecLinkDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpecLinkDialogSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2LinkValueSpecLinkDialogSpecMutableBuilder[Self <: GoogleActionsV2LinkValueSpecLinkDialogSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setRequestLinkReason(value: String): Self = StObject.set(x, "requestLinkReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestLinkReasonUndefined: Self = StObject.set(x, "requestLinkReason", js.undefined)
  }
}
