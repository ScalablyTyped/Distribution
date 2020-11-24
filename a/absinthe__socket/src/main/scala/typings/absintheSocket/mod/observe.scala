package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@absinthe/socket", "observe")
@js.native
object observe extends js.Object {
  
  def apply[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = js.native
}
