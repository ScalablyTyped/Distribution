package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsentCallback extends js.Object {
  
  var consentCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSyncDone: js.UndefOr[js.Function0[Unit]] = js.native
}
object ConsentCallback {
  
  @scala.inline
  def apply(): ConsentCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentCallback]
  }
  
  @scala.inline
  implicit class ConsentCallbackOps[Self <: ConsentCallback] (val x: Self) extends AnyVal {
    
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
    def setConsentCallback(value: () => Unit): Self = this.set("consentCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConsentCallback: Self = this.set("consentCallback", js.undefined)
    
    @scala.inline
    def setOnSyncDone(value: () => Unit): Self = this.set("onSyncDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSyncDone: Self = this.set("onSyncDone", js.undefined)
  }
}
