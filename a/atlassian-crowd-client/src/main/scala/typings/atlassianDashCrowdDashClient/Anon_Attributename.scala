package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsAttributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributename extends js.Object {
  var password: Anon_Password
  var username: Anon_Email
  def list(username: String): js.Promise[^]
  def remove(username: String, attributename: String): js.Promise[Unit]
  def set(username: String, attributes: ^): js.Promise[^]
}

object Anon_Attributename {
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    password: Anon_Password,
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^],
    username: Anon_Email
  ): Anon_Attributename = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attributename]
  }
}

