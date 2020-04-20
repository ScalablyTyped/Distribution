package typings.atlassianCrowdClient

import typings.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemove extends js.Object {
  def list(groupname: String): js.Promise[^]
  def remove(groupname: String, attributename: String): js.Promise[Unit]
  def set(groupname: String, attributes: ^): js.Promise[^]
}

object AnonRemove {
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^]
  ): AnonRemove = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AnonRemove]
  }
}

