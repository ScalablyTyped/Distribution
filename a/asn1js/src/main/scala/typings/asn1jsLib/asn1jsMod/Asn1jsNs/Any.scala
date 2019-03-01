package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Any extends js.Object {
  var name: java.lang.String
  var optional: scala.Boolean
}

object Any {
  @scala.inline
  def apply(name: java.lang.String, optional: scala.Boolean): Any = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[Any]
  }
}

