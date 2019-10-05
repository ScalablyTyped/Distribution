package typings.alksDashNode.alksDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "getDurations")
@js.native
object getDurations extends js.Object {
  def apply(
    account: Account,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* duration */ js.Array[Double], Unit]
  ): Unit = js.native
}

