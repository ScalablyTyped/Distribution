package typings.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "createAuthenticationContext")
@js.native
object createAuthenticationContext extends js.Object {
  
  def apply(authority: String): AuthenticationContext = js.native
  def apply(authority: String, validateAuthority: Boolean): AuthenticationContext = js.native
}
