package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@absinthe/socket", "unobserveOrCancel")
@js.native
object unobserveOrCancel extends js.Object {
  def apply[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: Observer[Variables, js.Object]
  ): AbsintheSocket[js.Object] = js.native
}

