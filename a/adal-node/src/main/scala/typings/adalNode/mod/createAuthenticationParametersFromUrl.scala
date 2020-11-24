package typings.adalNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "createAuthenticationParametersFromUrl")
@js.native
object createAuthenticationParametersFromUrl extends js.Object {
  
  def apply(
    url: String,
    callback: js.Function2[/* error */ Error, /* parameters */ AuthenticationParameters, Unit]
  ): AuthenticationParameters = js.native
  def apply(
    url: String,
    callback: js.Function2[/* error */ Error, /* parameters */ AuthenticationParameters, Unit],
    correlationId: String
  ): AuthenticationParameters = js.native
}
