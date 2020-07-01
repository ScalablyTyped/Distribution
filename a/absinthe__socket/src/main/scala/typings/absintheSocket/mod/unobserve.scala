package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@absinthe/socket", "unobserve")
@js.native
object unobserve extends js.Object {
  def apply[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = js.native
}

