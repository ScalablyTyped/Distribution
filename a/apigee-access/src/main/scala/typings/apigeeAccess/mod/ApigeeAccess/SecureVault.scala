package typings.apigeeAccess.mod.ApigeeAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureVault extends js.Object {
  def get(key: String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit
  def getKeys(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit
}

object SecureVault {
  @scala.inline
  def apply(
    get: (String, js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]) => Unit,
    getKeys: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit] => Unit
  ): SecureVault = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), getKeys = js.Any.fromFunction1(getKeys))
    __obj.asInstanceOf[SecureVault]
  }
}

