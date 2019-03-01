package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repeated extends js.Object {
  var local: scala.Boolean
  var name: java.lang.String
  var optional: scala.Boolean
  var value: Any
}

object Repeated {
  @scala.inline
  def apply(local: scala.Boolean, name: java.lang.String, optional: scala.Boolean, value: Any): Repeated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("local")(local)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Repeated]
  }
}

