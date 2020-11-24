package typings.arbiter.ArbiterDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishOptions extends js.Object {
  
  /**
    * If you wish to notify the subscribers but return from the publish() call before
    * the subscriber functions execute, use asynchronous mode
    */
  var async: js.UndefOr[Boolean] = js.native
  
  /**
    * By default, subscribers can return "false" to prevent subsequent subscribers from
    * receiving the message. By passing cancelable:false in the options, the publisher
    * can prevent canceling.
    */
  var cancelable: js.UndefOr[Boolean] = js.native
  
  /**
    * If the publishers wants subscribers to be notified even if they subscribe later,
    * setting the persist flag will do that.
    */
  var persist: js.UndefOr[Boolean] = js.native
}
object PublishOptions {
  
  @scala.inline
  def apply(): PublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishOptions]
  }
  
  @scala.inline
  implicit class PublishOptionsOps[Self <: PublishOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
  }
}
