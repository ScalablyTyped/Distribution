package typings.alksDashNode.alksDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "deleteIamRole")
@js.native
object deleteIamRole extends js.Object {
  def apply(
    account: Account,
    auth: Auth,
    roleName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
}

