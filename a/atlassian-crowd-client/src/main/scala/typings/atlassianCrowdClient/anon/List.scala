package typings.atlassianCrowdClient.anon

import typings.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var password: Reset
  var username: Request
  def list(username: String): js.Promise[^]
  def remove(username: String, attributename: String): js.Promise[Unit]
  def set(username: String, attributes: ^): js.Promise[^]
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
}

