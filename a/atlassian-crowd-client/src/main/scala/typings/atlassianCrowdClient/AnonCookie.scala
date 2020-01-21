package typings.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookie extends js.Object {
  def cookie(): js.Promise[_]
}

object AnonCookie {
  @scala.inline
  def apply(cookie: () => js.Promise[_]): AnonCookie = {
    val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction0(cookie))
  
    __obj.asInstanceOf[AnonCookie]
  }
}

