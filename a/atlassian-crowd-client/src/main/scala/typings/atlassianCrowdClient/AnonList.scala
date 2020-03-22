package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonList extends js.Object {
  var password: AnonReset
  var username: AnonRequest
  def list(username: String): js.Promise[^]
  def remove(username: String, attributename: String): js.Promise[Unit]
  def set(username: String, attributes: ^): js.Promise[^]
}

object AnonList {
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    password: AnonReset,
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^],
    username: AnonRequest
  ): AnonList = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonList]
  }
}

