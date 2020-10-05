package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EURGBP extends js.Object {
  var EUR: js.Array[js.UndefOr[String]] = js.native
  var GBP: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object EURGBP {
  @scala.inline
  def apply(
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    USD: js.Array[String]
  ): EURGBP = {
    val __obj = js.Dynamic.literal(EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EURGBP]
  }
  @scala.inline
  implicit class EURGBPOps[Self <: EURGBP] (val x: Self) extends AnyVal {
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
    def setEURVarargs(value: js.UndefOr[String]*): Self = this.set("EUR", js.Array(value :_*))
    @scala.inline
    def setEUR(value: js.Array[js.UndefOr[String]]): Self = this.set("EUR", value.asInstanceOf[js.Any])
    @scala.inline
    def setGBPVarargs(value: js.UndefOr[String]*): Self = this.set("GBP", js.Array(value :_*))
    @scala.inline
    def setGBP(value: js.Array[js.UndefOr[String]]): Self = this.set("GBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

