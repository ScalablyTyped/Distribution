package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsOpenUrlAction extends StObject {
  
  /**
    * Information about the Android App if the URL is expected to be
    * fulfilled by an Android App.
    */
  var androidApp: js.UndefOr[GoogleActionsV2DevicesAndroidApp] = js.undefined
  
  /**
    * The url field which could be any of:
    * - http/https urls for opening an App-linked App or a webpage
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates a hint for the url type.
    */
  var urlTypeHint: js.UndefOr[GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint] = js.undefined
}
object GoogleActionsV2UiElementsOpenUrlAction {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsOpenUrlAction]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsOpenUrlActionMutableBuilder[Self <: GoogleActionsV2UiElementsOpenUrlAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidApp(value: GoogleActionsV2DevicesAndroidApp): Self = StObject.set(x, "androidApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidAppUndefined: Self = StObject.set(x, "androidApp", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTypeHint(value: GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint): Self = StObject.set(x, "urlTypeHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTypeHintUndefined: Self = StObject.set(x, "urlTypeHint", js.undefined)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
