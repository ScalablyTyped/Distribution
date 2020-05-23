package typings.asn1js.mod

import typings.asn1js.anon.IsIndefiniteForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalLengthBlockParams extends js.Object {
  var lenBlock: js.UndefOr[IsIndefiniteForm] = js.undefined
}

object LocalLengthBlockParams {
  @scala.inline
  def apply(lenBlock: IsIndefiniteForm = null): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    if (lenBlock != null) __obj.updateDynamic("lenBlock")(lenBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
}

