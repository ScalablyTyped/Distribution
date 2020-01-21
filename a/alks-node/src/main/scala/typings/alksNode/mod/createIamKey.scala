package typings.alksNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "createIamKey")
@js.native
object createIamKey extends js.Object {
  def apply(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* key */ KeyData, Unit]
  ): Unit = js.native
}

