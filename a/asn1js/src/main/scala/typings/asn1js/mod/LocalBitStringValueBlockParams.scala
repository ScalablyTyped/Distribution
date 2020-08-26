package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBaseBlockParams because Already inherited
- typings.asn1js.mod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ @js.native
trait LocalBitStringValueBlockParams extends LocalConstructedValueBlockParams {
  var isConstructed: js.UndefOr[scala.Boolean] = js.native
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  var unusedBits: js.UndefOr[Double] = js.native
  var valueHex: js.UndefOr[ArrayBuffer] = js.native
}

object LocalBitStringValueBlockParams {
  @scala.inline
  def apply(): LocalBitStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBitStringValueBlockParams]
  }
  @scala.inline
  implicit class LocalBitStringValueBlockParamsOps[Self <: LocalBitStringValueBlockParams] (val x: Self) extends AnyVal {
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
    def setIsConstructed(value: scala.Boolean): Self = this.set("isConstructed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConstructed: Self = this.set("isConstructed", js.undefined)
    @scala.inline
    def setIsHexOnly(value: scala.Boolean): Self = this.set("isHexOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHexOnly: Self = this.set("isHexOnly", js.undefined)
    @scala.inline
    def setUnusedBits(value: Double): Self = this.set("unusedBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedBits: Self = this.set("unusedBits", js.undefined)
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = this.set("valueHex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueHex: Self = this.set("valueHex", js.undefined)
  }
  
}

