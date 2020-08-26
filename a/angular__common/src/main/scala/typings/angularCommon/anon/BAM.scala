package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BAM extends js.Object {
  var BAM: js.Array[String] = js.native
  var CZK: js.Array[String] = js.native
  var PLN: js.Array[String] = js.native
  var RSD: js.Array[String] = js.native
  var TRY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object BAM {
  @scala.inline
  def apply(
    BAM: js.Array[String],
    CZK: js.Array[String],
    PLN: js.Array[String],
    RSD: js.Array[String],
    TRY: js.Array[String],
    USD: js.Array[String]
  ): BAM = {
    val __obj = js.Dynamic.literal(BAM = BAM.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RSD = RSD.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BAM]
  }
  @scala.inline
  implicit class BAMOps[Self <: BAM] (val x: Self) extends AnyVal {
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
    def setBAMVarargs(value: String*): Self = this.set("BAM", js.Array(value :_*))
    @scala.inline
    def setBAM(value: js.Array[String]): Self = this.set("BAM", value.asInstanceOf[js.Any])
    @scala.inline
    def setCZKVarargs(value: String*): Self = this.set("CZK", js.Array(value :_*))
    @scala.inline
    def setCZK(value: js.Array[String]): Self = this.set("CZK", value.asInstanceOf[js.Any])
    @scala.inline
    def setPLNVarargs(value: String*): Self = this.set("PLN", js.Array(value :_*))
    @scala.inline
    def setPLN(value: js.Array[String]): Self = this.set("PLN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRSDVarargs(value: String*): Self = this.set("RSD", js.Array(value :_*))
    @scala.inline
    def setRSD(value: js.Array[String]): Self = this.set("RSD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRYVarargs(value: String*): Self = this.set("TRY", js.Array(value :_*))
    @scala.inline
    def setTRY(value: js.Array[String]): Self = this.set("TRY", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

