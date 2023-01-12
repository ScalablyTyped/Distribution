package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsLinkOutSuggestion extends StObject {
  
  /**
    * The name of the app or site this chip is linking to. The chip will be
    * rendered with the title \"Open <destination_name>\". Max 20 chars.
    * Required.
    */
  var destinationName: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the App or Site to open when the user taps the suggestion chip.
    * Ownership of this App/URL must be validated in the Actions on Google
    * developer  console, or the suggestion will not be shown to the user.
    * Open URL Action supports http, https and intent URLs.
    * For Intent URLs refer to:
    * https://developer.chrome.com/multidevice/android/intents
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
}
object GoogleActionsV2UiElementsLinkOutSuggestion {
  
  inline def apply(): GoogleActionsV2UiElementsLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsLinkOutSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2UiElementsLinkOutSuggestion] (val x: Self) extends AnyVal {
    
    inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
  }
}
