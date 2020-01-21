package typings.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassword extends js.Object {
  def reset(username: String): js.Promise[Unit]
  def set(username: String, password: String): js.Promise[Unit]
}

object AnonPassword {
  @scala.inline
  def apply(reset: String => js.Promise[Unit], set: (String, String) => js.Promise[Unit]): AnonPassword = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[AnonPassword]
  }
}

