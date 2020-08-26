package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientGrant extends js.Object {
  /**
    * The audience.
    */
  var audience: String = js.native
  /**
    * The identifier of the resource server.
    */
  var client_id: String = js.native
  var scope: js.Array[String] = js.native
}

object CreateClientGrant {
  @scala.inline
  def apply(audience: String, client_id: String, scope: js.Array[String]): CreateClientGrant = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientGrant]
  }
  @scala.inline
  implicit class CreateClientGrantOps[Self <: CreateClientGrant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

