package typings.atlassianDashCrowdDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  def cookie(): js.Promise[_]
}

object Anon_Cookie {
  @scala.inline
  def apply(cookie: () => js.Promise[_]): Anon_Cookie = {
    val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction0(cookie))
  
    __obj.asInstanceOf[Anon_Cookie]
  }
}

