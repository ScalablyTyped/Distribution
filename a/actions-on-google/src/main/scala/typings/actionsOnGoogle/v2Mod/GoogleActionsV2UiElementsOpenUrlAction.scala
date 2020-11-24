package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsOpenUrlAction extends js.Object {
  
  /**
    * Information about the Android App if the URL is expected to be
    * fulfilled by an Android App.
    */
  var androidApp: js.UndefOr[GoogleActionsV2DevicesAndroidApp] = js.native
  
  /**
    * The url field which could be any of:
    * - http/https urls for opening an App-linked App or a webpage
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Indicates a hint for the url type.
    */
  var urlTypeHint: js.UndefOr[GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint] = js.native
}
object GoogleActionsV2UiElementsOpenUrlAction {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsOpenUrlAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsOpenUrlAction]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsOpenUrlActionOps[Self <: GoogleActionsV2UiElementsOpenUrlAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAndroidApp(value: GoogleActionsV2DevicesAndroidApp): Self = this.set("androidApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidApp: Self = this.set("androidApp", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlTypeHint(value: GoogleActionsV2UiElementsOpenUrlActionUrlTypeHint): Self = this.set("urlTypeHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlTypeHint: Self = this.set("urlTypeHint", js.undefined)
  }
}
