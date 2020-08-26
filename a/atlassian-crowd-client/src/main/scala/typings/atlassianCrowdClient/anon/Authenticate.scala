package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticate extends js.Object {
  def authenticate(username: String, password: String): js.Promise[^] = js.native
}

object Authenticate {
  @scala.inline
  def apply(authenticate: (String, String) => js.Promise[^]): Authenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
    __obj.asInstanceOf[Authenticate]
  }
  @scala.inline
  implicit class AuthenticateOps[Self <: Authenticate] (val x: Self) extends AnyVal {
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
    def setAuthenticate(value: (String, String) => js.Promise[^]): Self = this.set("authenticate", js.Any.fromFunction2(value))
  }
  
}

