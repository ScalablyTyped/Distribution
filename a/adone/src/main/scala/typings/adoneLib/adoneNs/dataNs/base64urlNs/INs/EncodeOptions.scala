package typings
package adoneLib.adoneNs.dataNs.base64urlNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
}

object EncodeOptions {
  @scala.inline
  def apply(encoding: java.lang.String = null): EncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[EncodeOptions]
  }
}

