package typings.angularDashTranslate.angularDashTranslateMod.angularMod.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorage extends js.Object {
  def get(name: String): String
  def put(name: String, value: String): Unit
}

object IStorage {
  @scala.inline
  def apply(get: String => String, put: (String, String) => Unit): IStorage = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put))
  
    __obj.asInstanceOf[IStorage]
  }
}

