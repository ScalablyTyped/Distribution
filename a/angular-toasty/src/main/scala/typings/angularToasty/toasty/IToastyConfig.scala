package typings.angularToasty.toasty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastyConfig extends js.Object {
  
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether HTML is allowed in toasts.
    */
  var html: js.UndefOr[Boolean] = js.native
  
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[String] = js.native
  
  /**
    * Add event handler.
    */
  var onAdd: js.UndefOr[js.Function] = js.native
  
  /**
    * Click event handler.
    */
  var onClick: js.UndefOr[js.Function] = js.native
  
  /**
    * Remove event handler.
    */
  var onRemove: js.UndefOr[js.Function] = js.native
  
  /**
    * Whether to shake the toasts.
    */
  var shake: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to show the 'X' icon to close the toast.
    */
  var showClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to play a sound when a toast is added.
    */
  var sound: js.UndefOr[Boolean] = js.native
  
  /**
    * What theme to use.
    * - 'default'
    * - 'material'
    * - 'bootstrap'
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * How long (in milliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * The toast's title.
    */
  var title: String = js.native
  
  /**
    * The toast's type:
    * - 'default'
    * - 'info'
    * - 'success'
    * - 'wait'
    * - 'error'
    * - 'warning'
    */
  var `type`: js.UndefOr[String] = js.native
}
object IToastyConfig {
  
  @scala.inline
  def apply(title: String): IToastyConfig = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastyConfig]
  }
  
  @scala.inline
  implicit class IToastyConfigOps[Self <: IToastyConfig] (val x: Self) extends AnyVal {
    
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
    def setClickToClose(value: Boolean): Self = this.set("clickToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToClose: Self = this.set("clickToClose", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setOnAdd(value: js.Function): Self = this.set("onAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnRemove(value: js.Function): Self = this.set("onRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setShake(value: Boolean): Self = this.set("shake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShake: Self = this.set("shake", js.undefined)
    
    @scala.inline
    def setShowClose(value: Boolean): Self = this.set("showClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClose: Self = this.set("showClose", js.undefined)
    
    @scala.inline
    def setSound(value: Boolean): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
