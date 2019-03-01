package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawDataParams extends js.Object {
  var data: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
}

object RawDataParams {
  @scala.inline
  def apply(data: stdLib.ArrayBuffer = null): RawDataParams = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[RawDataParams]
  }
}

