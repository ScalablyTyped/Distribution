package typings.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "AuthenticationParameters")
@js.native
class AuthenticationParameters protected () extends js.Object {
  /**
    * @constructor Provides an instance of AuthenticationParameters
    * @param {string} authorizationUri The URI of an authority that can issues tokens for the resource that issued the challenge.
    * @param {string} resource         The resource for a which a token should be requested from the authority.
    */
  def this(authorizationUri: String, resource: String) = this()
  
  var authorizationUri: String = js.native
  
  var resource: String = js.native
}
