package typings.alksDashNode.alksDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "getIamRoleTypes")
@js.native
object getIamRoleTypes extends js.Object {
  def apply(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
}

