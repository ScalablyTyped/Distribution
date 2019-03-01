package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def emit(`type`: java.lang.String, args: js.Any*): scala.Unit
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit
}

object Anon_Args {
  @scala.inline
  def apply(
    emit: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    on: js.Function2[java.lang.String, js.Function, scala.Unit]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("on")(on)
    __obj.asInstanceOf[Anon_Args]
  }
}

