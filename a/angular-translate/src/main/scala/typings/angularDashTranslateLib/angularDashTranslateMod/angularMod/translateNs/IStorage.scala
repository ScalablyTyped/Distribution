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
  def apply(get: java.lang.String => java.lang.String, put: (java.lang.String, java.lang.String) => scala.Unit): IStorage = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put))
  
    __obj.asInstanceOf[IStorage]
  }
}

