package typings.asn1js.mod

import typings.asn1js.AnonIsConstructed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalIdentificationBlockParams extends js.Object {
  var idBlock: js.UndefOr[LocalHexBlockParams with AnonIsConstructed] = js.undefined
}

object LocalIdentificationBlockParams {
  @scala.inline
  def apply(idBlock: LocalHexBlockParams with AnonIsConstructed = null): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    if (idBlock != null) __obj.updateDynamic("idBlock")(idBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
}

