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
    access: java.lang.String => Delegator,
    getter: java.lang.String => Delegator,
    method: java.lang.String => Delegator,
    setter: java.lang.String => Delegator
  ): Delegator = {
    val __obj = js.Dynamic.literal(access = js.Any.fromFunction1(access), getter = js.Any.fromFunction1(getter), method = js.Any.fromFunction1(method), setter = js.Any.fromFunction1(setter))
  
    __obj.asInstanceOf[Delegator]
  }
}

