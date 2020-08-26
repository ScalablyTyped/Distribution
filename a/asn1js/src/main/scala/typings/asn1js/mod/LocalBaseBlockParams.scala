package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBaseBlockParams extends js.Object {
  var blockLength: js.UndefOr[Double] = js.native
  var error: js.UndefOr[String] = js.native
  var valueBeforeDecode: js.UndefOr[ArrayBuffer] = js.native
  var warnings: js.UndefOr[js.Array[String]] = js.native
}

object LocalBaseBlockParams {
  @scala.inline
  def apply(): LocalBaseBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBaseBlockParams]
  }
  @scala.inline
  implicit class LocalBaseBlockParamsOps[Self <: LocalBaseBlockParams] (val x: Self) extends AnyVal {
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
    def setValueBeforeDecode(value: ArrayBuffer): Self = this.set("valueBeforeDecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBeforeDecode: Self = this.set("valueBeforeDecode", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

