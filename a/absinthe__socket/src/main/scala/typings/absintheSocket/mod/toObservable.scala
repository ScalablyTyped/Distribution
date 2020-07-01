package typings.absintheSocket.mod

import typings.absintheSocket.anon.OnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@absinthe/socket", "toObservable")
@js.native
object toObservable extends js.Object {
  def apply[Variables](absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[Variables, js.Object]): Observer[Variables, js.Object] = js.native
  def apply[Variables](
    absintheSocket: AbsintheSocket[js.Object],
    notifier: Notifier[Variables, js.Object],
    observer: OnError[Variables]
  ): Observer[Variables, js.Object] = js.native
}

