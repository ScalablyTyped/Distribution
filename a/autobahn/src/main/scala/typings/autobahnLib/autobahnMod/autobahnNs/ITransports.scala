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
    get: js.Function1[java.lang.String, js.Any],
    isRegistered: js.Function1[java.lang.String, scala.Boolean],
    list: js.Function0[js.Array[java.lang.String]],
    register: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ITransports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("isRegistered")(isRegistered)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[ITransports]
  }
}

