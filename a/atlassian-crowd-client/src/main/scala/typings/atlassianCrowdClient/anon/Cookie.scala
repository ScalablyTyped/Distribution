package typings.atlassianCrowdClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  def cookie(): js.Promise[_]
}

object Cookie {
  @scala.inline
  def apply(cookie: () => js.Promise[_]): Cookie = {
    val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction0(cookie))
    __obj.asInstanceOf[Cookie]
  }
}

