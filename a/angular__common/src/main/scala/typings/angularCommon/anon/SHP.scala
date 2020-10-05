package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SHP extends js.Object {
  var GBP: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var SHP: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object SHP {
  @scala.inline
  def apply(GBP: js.Array[String], JPY: js.Array[String], SHP: js.Array[String], USD: js.Array[String]): SHP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SHP = SHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SHP]
  }
  @scala.inline
  implicit class SHPOps[Self <: SHP] (val x: Self) extends AnyVal {
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
    def setGBPVarargs(value: String*): Self = this.set("GBP", js.Array(value :_*))
    @scala.inline
    def setGBP(value: js.Array[String]): Self = this.set("GBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHPVarargs(value: String*): Self = this.set("SHP", js.Array(value :_*))
    @scala.inline
    def setSHP(value: js.Array[String]): Self = this.set("SHP", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

