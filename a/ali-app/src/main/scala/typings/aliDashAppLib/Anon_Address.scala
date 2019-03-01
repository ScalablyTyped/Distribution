package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var name: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, name: java.lang.String): Anon_Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Address]
  }
}

