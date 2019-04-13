package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BmpStringParams extends js.Object {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object BmpStringParams {
  @scala.inline
  def apply(value: java.lang.String = null): BmpStringParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BmpStringParams]
  }
}

