package typings.angularSignalrHub

import typings.jquery.JQueryDeferred
import typings.jquery.JQueryPromise
import typings.signalr.SignalR.Connection
import typings.signalr.SignalR.Hub.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object ngSignalr extends js.Object {
    @js.native
    class Hub ()
      extends typings.angularSignalrHub.ngSignalr.Hub {
      /* CompleteClass */
      override var connection: Connection = js.native
      /* CompleteClass */
      override var hubName: String = js.native
      /* CompleteClass */
      override var proxy: Proxy = js.native
      /* CompleteClass */
      override def connect(): JQueryPromise[_] = js.native
      /* CompleteClass */
      override def disconnect(): Unit = js.native
      /* CompleteClass */
      override def invoke(method: String, args: js.Any*): JQueryDeferred[_] = js.native
      /* CompleteClass */
      override def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    }
    
  }
  
}

