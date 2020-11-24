package typings.actionsOnGoogle.buttonMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsOpenUrlAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonOptions extends js.Object {
  
  /**
    * Action to take when selected. Recommended to use the url property for simple web page url open.
    * @public
    */
  var action: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  
  /**
    * Text shown on the button.
    * @public
    */
  var title: String = js.native
  
  /**
    * String URL to open.
    * @public
    */
  var url: js.UndefOr[String] = js.native
}
object ButtonOptions {
  
  @scala.inline
  def apply(title: String): ButtonOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
  
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
