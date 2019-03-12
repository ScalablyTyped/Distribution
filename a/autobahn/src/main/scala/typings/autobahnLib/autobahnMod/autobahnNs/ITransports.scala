package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransports extends js.Object {
  def get(name: java.lang.String): js.Any
  def isRegistered(name: java.lang.String): scala.Boolean
  def list(): js.Array[java.lang.String]
  def register(name: java.lang.String, factory: js.Any): scala.Unit
}

object ITransports {
  @scala.inline
  def apply(
    get: java.lang.String => js.Any,
    isRegistered: java.lang.String => scala.Boolean,
    list: () => js.Array[java.lang.String],
    register: (java.lang.String, js.Any) => scala.Unit
  ): ITransports = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), isRegistered = js.Any.fromFunction1(isRegistered), list = js.Any.fromFunction0(list), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[ITransports]
  }
}

