package typings.alksNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("alks-node", "getAccounts")
@js.native
object getAccounts extends js.Object {
  
  def apply(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* accounts */ js.Array[AlksAccount], Unit]
  ): Unit = js.native
}
