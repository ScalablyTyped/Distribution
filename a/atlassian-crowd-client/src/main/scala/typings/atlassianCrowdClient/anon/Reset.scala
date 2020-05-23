package typings.atlassianCrowdClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reset extends js.Object {
  def reset(username: String): js.Promise[Unit]
  def set(username: String, password: String): js.Promise[Unit]
}

object Reset {
  @scala.inline
  def apply(reset: String => js.Promise[Unit], set: (String, String) => js.Promise[Unit]): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Reset]
  }
}

