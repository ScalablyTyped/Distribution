package typings.auth0Angular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuth0Options extends js.Object {
  /**
    * Connection name
    */
  var connection: js.UndefOr[String] = js.native
  /**
    * Email address
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Username
    */
  var username: js.UndefOr[String] = js.native
}

object IAuth0Options {
  @scala.inline
  def apply(): IAuth0Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuth0Options]
  }
  @scala.inline
  implicit class IAuth0OptionsOps[Self <: IAuth0Options] (val x: Self) extends AnyVal {
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

