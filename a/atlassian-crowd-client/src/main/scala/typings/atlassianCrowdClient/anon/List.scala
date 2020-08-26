package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List extends js.Object {
  var password: Reset = js.native
  var username: Request = js.native
  def list(username: String): js.Promise[^] = js.native
  def remove(username: String, attributename: String): js.Promise[Unit] = js.native
  def set(username: String, attributes: ^): js.Promise[^] = js.native
}

object List {
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    password: Reset,
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^],
    username: Request
  ): List = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setList(value: String => js.Promise[^]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPassword(value: Reset): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: (String, String) => js.Promise[Unit]): Self = this.set("remove", js.Any.fromFunction2(value))
    @scala.inline
    def setSet(value: (String, ^) => js.Promise[^]): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setUsername(value: Request): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

