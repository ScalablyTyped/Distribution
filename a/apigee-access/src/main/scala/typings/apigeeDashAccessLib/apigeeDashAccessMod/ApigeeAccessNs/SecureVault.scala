package typings
package apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureVault extends js.Object {
  def get(key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): scala.Unit
  def getKeys(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): scala.Unit
}

object SecureVault {
  @scala.inline
  def apply(
    get: (java.lang.String, js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]) => scala.Unit,
    getKeys: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit] => scala.Unit
  ): SecureVault = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), getKeys = js.Any.fromFunction1(getKeys))
  
    __obj.asInstanceOf[SecureVault]
  }
}

