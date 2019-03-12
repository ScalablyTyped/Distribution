package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  def request(email: java.lang.String): js.Promise[scala.Unit]
}

object Anon_Email {
  @scala.inline
  def apply(request: java.lang.String => js.Promise[scala.Unit]): Anon_Email = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[Anon_Email]
  }
}

