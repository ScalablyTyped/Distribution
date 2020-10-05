package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPYNOK extends js.Object {
  var DKK: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var NOK: js.Array[String] = js.native
  var SEK: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object JPYNOK {
  @scala.inline
  def apply(
    DKK: js.Array[String],
    JPY: js.Array[String],
    NOK: js.Array[String],
    SEK: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): JPYNOK = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYNOK]
  }
  @scala.inline
  implicit class JPYNOKOps[Self <: JPYNOK] (val x: Self) extends AnyVal {
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
    def setDKKVarargs(value: String*): Self = this.set("DKK", js.Array(value :_*))
    @scala.inline
    def setDKK(value: js.Array[String]): Self = this.set("DKK", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOKVarargs(value: String*): Self = this.set("NOK", js.Array(value :_*))
    @scala.inline
    def setNOK(value: js.Array[String]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setSEKVarargs(value: String*): Self = this.set("SEK", js.Array(value :_*))
    @scala.inline
    def setSEK(value: js.Array[String]): Self = this.set("SEK", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

