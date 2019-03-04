package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  def reset(username: java.lang.String): js.Promise[scala.Unit]
  def set(username: java.lang.String, password: java.lang.String): js.Promise[scala.Unit]
}

object Anon_Password {
  @scala.inline
  def apply(
    reset: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    set: js.Function2[java.lang.String, java.lang.String, js.Promise[scala.Unit]]
  ): Anon_Password = {
    val __obj = js.Dynamic.literal(reset = reset, set = set)
  
    __obj.asInstanceOf[Anon_Password]
  }
}

