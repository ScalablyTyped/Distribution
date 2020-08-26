package typings.asn1js.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asn1js.asn1js.LocalHexBlockParams & {  isConstructed :boolean | undefined,   tagClass :number | undefined,   tagNumber :number | undefined} */
@js.native
trait LocalHexBlockParamsisCons extends js.Object {
  var blockLength: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var isConstructed: js.UndefOr[Boolean] = js.native
  var isHexOnly: js.UndefOr[Boolean] = js.native
  var tagClass: js.UndefOr[Double] = js.native
  var tagNumber: js.UndefOr[Double] = js.native
  var valueBeforeDecode: js.UndefOr[ArrayBuffer] = js.native
  var valueHex: js.UndefOr[ArrayBuffer] = js.native
  var warnings: js.UndefOr[js.Array[String]] = js.native
}

object LocalHexBlockParamsisCons {
  @scala.inline
  def apply(): LocalHexBlockParamsisCons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalHexBlockParamsisCons]
  }
  @scala.inline
  implicit class LocalHexBlockParamsisConsOps[Self <: LocalHexBlockParamsisCons] (val x: Self) extends AnyVal {
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
    def setBlockLength(value: Double): Self = this.set("blockLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockLength: Self = this.set("blockLength", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setIsConstructed(value: Boolean): Self = this.set("isConstructed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConstructed: Self = this.set("isConstructed", js.undefined)
    @scala.inline
    def setIsHexOnly(value: Boolean): Self = this.set("isHexOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHexOnly: Self = this.set("isHexOnly", js.undefined)
    @scala.inline
    def setTagClass(value: Double): Self = this.set("tagClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagClass: Self = this.set("tagClass", js.undefined)
    @scala.inline
    def setTagNumber(value: Double): Self = this.set("tagNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagNumber: Self = this.set("tagNumber", js.undefined)
    @scala.inline
    def setValueBeforeDecode(value: ArrayBuffer): Self = this.set("valueBeforeDecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBeforeDecode: Self = this.set("valueBeforeDecode", js.undefined)
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = this.set("valueHex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueHex: Self = this.set("valueHex", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

