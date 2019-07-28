package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Identity extends js.Object {
  var connection: String
  var isSocial: Boolean
  var provider: String
  var user_id: String
}

object Auth0Identity {
  @scala.inline
  def apply(connection: String, isSocial: Boolean, provider: String, user_id: String): Auth0Identity = {
    val __obj = js.Dynamic.literal(connection = connection, isSocial = isSocial, provider = provider, user_id = user_id)
  
    __obj.asInstanceOf[Auth0Identity]
  }
}

