package typings.actioncable.ActionCable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMixin
  extends /* key */ StringDictionary[js.Any] {
  
  var connected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var received: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.native
}
object CreateMixin {
  
  @scala.inline
  def apply(): CreateMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMixin]
  }
  
  @scala.inline
  implicit class CreateMixinOps[Self <: CreateMixin] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: () => Unit): Self = this.set("connected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    
    @scala.inline
    def setDisconnected(value: () => Unit): Self = this.set("disconnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisconnected: Self = this.set("disconnected", js.undefined)
    
    @scala.inline
    def setReceived(value: /* obj */ js.Any => Unit): Self = this.set("received", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReceived: Self = this.set("received", js.undefined)
  }
}
