package typings
package apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SecureVault extends js.Object {
  def get(key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): scala.Unit
  def getKeys(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): scala.Unit
}

