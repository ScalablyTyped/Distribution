package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utf8StringParams extends js.Object {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Utf8StringParams {
  @scala.inline
  def apply(value: java.lang.String = null): Utf8StringParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Utf8StringParams]
  }
}

