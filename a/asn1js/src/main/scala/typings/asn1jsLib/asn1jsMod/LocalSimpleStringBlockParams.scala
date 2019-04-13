package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalSimpleStringBlockParams extends js.Object {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object LocalSimpleStringBlockParams {
  @scala.inline
  def apply(value: java.lang.String = null): LocalSimpleStringBlockParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LocalSimpleStringBlockParams]
  }
}

