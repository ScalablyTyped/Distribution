package typings.alksNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "createLongTermKey")
@js.native
object createLongTermKey extends js.Object {
  def apply(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* data */ LongTermKeyData, Unit]
  ): Unit = js.native
}

