package typings.asn1js.mod

import typings.asn1js.anon.LocalHexBlockParamsisCons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalIdentificationBlockParams extends js.Object {
  var idBlock: js.UndefOr[LocalHexBlockParamsisCons] = js.native
}

object LocalIdentificationBlockParams {
  @scala.inline
  def apply(): LocalIdentificationBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIdentificationBlockParams]
  }
  @scala.inline
  implicit class LocalIdentificationBlockParamsOps[Self <: LocalIdentificationBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdBlock(value: LocalHexBlockParamsisCons): Self = this.set("idBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdBlock: Self = this.set("idBlock", js.undefined)
  }
  
}

