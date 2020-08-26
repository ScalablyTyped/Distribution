package typings.atlassianCrowdClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookie extends js.Object {
  def cookie(): js.Promise[_] = js.native
}

object Cookie {
  @scala.inline
  def apply(cookie: () => js.Promise[_]): Cookie = {
    val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction0(cookie))
    __obj.asInstanceOf[Cookie]
  }
  @scala.inline
  implicit class CookieOps[Self <: Cookie] (val x: Self) extends AnyVal {
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
    def setCookie(value: () => js.Promise[_]): Self = this.set("cookie", js.Any.fromFunction0(value))
  }
  
}

