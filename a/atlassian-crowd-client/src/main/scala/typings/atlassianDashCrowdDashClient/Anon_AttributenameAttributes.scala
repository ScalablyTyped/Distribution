package typings.atlassianDashCrowdDashClient

import typings.atlassianDashCrowdDashClient.libModelsAttributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributenameAttributes extends js.Object {
  def list(groupname: String): js.Promise[^]
  def remove(groupname: String, attributename: String): js.Promise[Unit]
  def set(groupname: String, attributes: ^): js.Promise[^]
}

object Anon_AttributenameAttributes {
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^]
  ): Anon_AttributenameAttributes = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon_AttributenameAttributes]
  }
}

