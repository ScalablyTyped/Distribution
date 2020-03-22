package typings.asn1js.mod

import typings.asn1js.LocalHexBlockParamsisCons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalIdentificationBlockParams extends js.Object {
  var idBlock: js.UndefOr[LocalHexBlockParamsisCons] = js.undefined
}

object LocalIdentificationBlockParams {
  @scala.inline
  def apply(idBlock: LocalHexBlockParamsisCons = null): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    if (idBlock != null) __obj.updateDynamic("idBlock")(idBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
}

