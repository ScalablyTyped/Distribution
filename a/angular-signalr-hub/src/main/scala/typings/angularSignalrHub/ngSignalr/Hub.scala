package typings.angularSignalrHub.ngSignalr

import typings.jquery.JQueryDeferred
import typings.jquery.JQueryPromise
import typings.signalr.SignalR.Connection
import typings.signalr.SignalR.Hub.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hub extends js.Object {
  
  def connect(): JQueryPromise[_] = js.native
  
  var connection: Connection = js.native
  
  def disconnect(): Unit = js.native
  
  var hubName: String = js.native
  
  def invoke(method: String, args: js.Any*): JQueryDeferred[_] = js.native
  
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  var proxy: Proxy = js.native
}
object Hub {
  
  @scala.inline
  def apply(
    connect: () => JQueryPromise[_],
    connection: Connection,
    disconnect: () => Unit,
    hubName: String,
    invoke: (String, /* repeated */ js.Any) => JQueryDeferred[_],
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    proxy: Proxy
  ): Hub = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), connection = connection.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), hubName = hubName.asInstanceOf[js.Any], invoke = js.Any.fromFunction2(invoke), on = js.Any.fromFunction2(on), proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hub]
  }
  
  @scala.inline
  implicit class HubOps[Self <: Hub] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: () => JQueryPromise[_]): Self = this.set("connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHubName(value: String): Self = this.set("hubName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoke(value: (String, /* repeated */ js.Any) => JQueryDeferred[_]): Self = this.set("invoke", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProxy(value: Proxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
  }
}
