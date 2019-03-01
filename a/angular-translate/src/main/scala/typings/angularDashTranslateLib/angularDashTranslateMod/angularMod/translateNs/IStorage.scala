package typings
package angularDashTranslateLib.angularDashTranslateMod.angularMod.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorage extends js.Object {
  def get(name: java.lang.String): java.lang.String
  def put(name: java.lang.String, value: java.lang.String): scala.Unit
}

object IStorage {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, java.lang.String],
    put: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): IStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("put")(put)
    __obj.asInstanceOf[IStorage]
  }
}

