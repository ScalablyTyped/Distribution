package typings.angularSignalrHub

import typings.jquery.JQueryDeferred
import typings.jquery.JQueryPromise
import typings.signalr.SignalR.Connection
import typings.signalr.SignalR.Hub.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ngSignalr {
    
    @JSGlobal("ngSignalr.Hub")
    @js.native
    class Hub ()
      extends StObject
         with typings.angularSignalrHub.ngSignalr.Hub {
      
      /* CompleteClass */
      override def connect(): JQueryPromise[js.Any] = js.native
      
      /* CompleteClass */
      var connection: Connection = js.native
      
      /* CompleteClass */
      override def disconnect(): Unit = js.native
      
      /* CompleteClass */
      var hubName: String = js.native
      
      /* CompleteClass */
      override def invoke(method: String, args: js.Any*): JQueryDeferred[js.Any] = js.native
      
      /* CompleteClass */
      override def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
      
      /* CompleteClass */
      var proxy: Proxy = js.native
    }
  }
}
