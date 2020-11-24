package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeBase extends RestBase {
  
  var clientId: String = js.native
  
  def close(): Unit = js.native
  
  def connect(): Unit = js.native
}
object RealtimeBase {
  
  @scala.inline
  def apply(clientId: String, close: () => Unit, connect: () => Unit): RealtimeBase = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
    __obj.asInstanceOf[RealtimeBase]
  }
  
  @scala.inline
  implicit class RealtimeBaseOps[Self <: RealtimeBase] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
  }
}
