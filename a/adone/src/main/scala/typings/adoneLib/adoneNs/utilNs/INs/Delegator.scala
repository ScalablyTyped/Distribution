package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegator extends js.Object {
  def access(name: java.lang.String): Delegator
  def getter(name: java.lang.String): Delegator
  def method(name: java.lang.String): Delegator
  def setter(name: java.lang.String): Delegator
}

object Delegator {
  @scala.inline
  def apply(
    access: js.Function1[java.lang.String, Delegator],
    getter: js.Function1[java.lang.String, Delegator],
    method: js.Function1[java.lang.String, Delegator],
    setter: js.Function1[java.lang.String, Delegator]
  ): Delegator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access")(access)
    __obj.updateDynamic("getter")(getter)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("setter")(setter)
    __obj.asInstanceOf[Delegator]
  }
}

