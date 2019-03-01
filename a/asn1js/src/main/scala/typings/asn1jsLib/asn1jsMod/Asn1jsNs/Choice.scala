package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  var optional: scala.Boolean
  var value: js.Array[LocalValueBlock]
}

object Choice {
  @scala.inline
  def apply(optional: scala.Boolean, value: js.Array[LocalValueBlock]): Choice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Choice]
  }
}

