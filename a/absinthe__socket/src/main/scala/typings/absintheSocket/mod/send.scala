package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@absinthe/socket", "send")
@js.native
object send extends js.Object {
  
  def apply[Variables](absintheSocket: AbsintheSocket[js.Object], gqlRequest: GqlRequest[Variables]): Notifier[Variables, js.Object] = js.native
}
