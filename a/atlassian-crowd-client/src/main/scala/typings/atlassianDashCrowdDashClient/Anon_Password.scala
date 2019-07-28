package typings.atlassianDashCrowdDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  def reset(username: String): js.Promise[Unit]
  def set(username: String, password: String): js.Promise[Unit]
}

object Anon_Password {
  @scala.inline
  def apply(reset: String => js.Promise[Unit], set: (String, String) => js.Promise[Unit]): Anon_Password = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon_Password]
  }
}

