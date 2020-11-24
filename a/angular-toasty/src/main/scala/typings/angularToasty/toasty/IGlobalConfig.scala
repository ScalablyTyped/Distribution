package typings.angularToasty.toasty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlobalConfig extends js.Object {
  
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether HTML is allowed in toast.
    */
  var html: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of toasts to show at once.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[String] = js.native
  
  /**
    * The window position where the toast pops up.
    *
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Whether to shake the toast.
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
    * How long (in miliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[Double | Boolean] = js.native
  
  /**
    * The toast's title.
    */
  var title: js.UndefOr[String] = js.native
}
object IGlobalConfig {
  
  @scala.inline
  def apply(): IGlobalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalConfig]
  }
  
  @scala.inline
  implicit class IGlobalConfigOps[Self <: IGlobalConfig] (val x: Self) extends AnyVal {
    
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
    def setClickToClose(value: Boolean): Self = this.set("clickToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToClose: Self = this.set("clickToClose", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsg: Self = this.set("msg", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
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
    def setTimeout(value: Double | Boolean): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
