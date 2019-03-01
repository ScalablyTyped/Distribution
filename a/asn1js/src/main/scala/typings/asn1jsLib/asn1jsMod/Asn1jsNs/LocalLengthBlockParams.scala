package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalLengthBlockParams extends js.Object {
  var lenBlock: js.UndefOr[asn1jsLib.Anon_IsIndefiniteForm] = js.undefined
}

object LocalLengthBlockParams {
  @scala.inline
  def apply(lenBlock: asn1jsLib.Anon_IsIndefiniteForm = null): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    if (lenBlock != null) __obj.updateDynamic("lenBlock")(lenBlock)
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
}

