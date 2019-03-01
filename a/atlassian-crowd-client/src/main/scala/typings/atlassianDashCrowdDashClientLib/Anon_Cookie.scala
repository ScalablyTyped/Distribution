package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookie extends js.Object {
  def cookie(): js.Promise[_]
}

object Anon_Cookie {
  @scala.inline
  def apply(cookie: js.Function0[js.Promise[_]]): Anon_Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    __obj.asInstanceOf[Anon_Cookie]
  }
}

