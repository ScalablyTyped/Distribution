package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSidValueBlockParams extends LocalHexBlockParams {
  var isFirstSid: js.UndefOr[scala.Boolean] = js.native
  var valueDec: js.UndefOr[Double] = js.native
}

object LocalSidValueBlockParams {
  @scala.inline
  def apply(): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
  @scala.inline
  implicit class LocalSidValueBlockParamsOps[Self <: LocalSidValueBlockParams] (val x: Self) extends AnyVal {
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
    def setIsFirstSid(value: scala.Boolean): Self = this.set("isFirstSid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFirstSid: Self = this.set("isFirstSid", js.undefined)
    @scala.inline
    def setValueDec(value: Double): Self = this.set("valueDec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDec: Self = this.set("valueDec", js.undefined)
  }
  
}

