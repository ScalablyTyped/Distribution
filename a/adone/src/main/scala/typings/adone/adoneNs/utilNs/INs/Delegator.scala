package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegator extends js.Object {
  def access(name: String): Delegator
  def getter(name: String): Delegator
  def method(name: String): Delegator
  def setter(name: String): Delegator
}

object Delegator {
  @scala.inline
  def apply(
    access: String => Delegator,
    getter: String => Delegator,
    method: String => Delegator,
    setter: String => Delegator
  ): Delegator = {
    val __obj = js.Dynamic.literal(access = js.Any.fromFunction1(access), getter = js.Any.fromFunction1(getter), method = js.Any.fromFunction1(method), setter = js.Any.fromFunction1(setter))
  
    __obj.asInstanceOf[Delegator]
  }
}

