package typings.absintheSocket

import typings.absintheSocket.mod.AbsintheSocket
import typings.absintheSocket.mod.Notifier
import typings.absintheSocket.mod.Observer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait OnError[Variables] extends js.Object {
    
    def onError(error: Error): js.Any = js.native
    
    def onStart(notifier: Notifier[Variables, js.Object]): js.Any = js.native
    
    def unsubscribe(absintheSocket: AbsintheSocket[js.Object]): Unit = js.native
    def unsubscribe(
      absintheSocket: AbsintheSocket[js.Object],
      notifier: js.UndefOr[scala.Nothing],
      observer: Observer[Variables, js.Object]
    ): Unit = js.native
    def unsubscribe(absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[Variables, js.Object]): Unit = js.native
    def unsubscribe(
      absintheSocket: AbsintheSocket[js.Object],
      notifier: Notifier[Variables, js.Object],
      observer: Observer[Variables, js.Object]
    ): Unit = js.native
  }
}
