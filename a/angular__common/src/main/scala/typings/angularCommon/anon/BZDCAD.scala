package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BZDCAD extends js.Object {
  var BBD: js.Array[String] = js.native
  var BMD: js.Array[String] = js.native
  var BZD: js.Array[String] = js.native
  var CAD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var PEN: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object BZDCAD {
  @scala.inline
  def apply(
    BBD: js.Array[String],
    BMD: js.Array[String],
    BZD: js.Array[String],
    CAD: js.Array[String],
    JPY: js.Array[String],
    PEN: js.Array[String],
    USD: js.Array[String]
  ): BZDCAD = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], BMD = BMD.asInstanceOf[js.Any], BZD = BZD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PEN = PEN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BZDCAD]
  }
  @scala.inline
  implicit class BZDCADOps[Self <: BZDCAD] (val x: Self) extends AnyVal {
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
    def setBBDVarargs(value: String*): Self = this.set("BBD", js.Array(value :_*))
    @scala.inline
    def setBBD(value: js.Array[String]): Self = this.set("BBD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBMDVarargs(value: String*): Self = this.set("BMD", js.Array(value :_*))
    @scala.inline
    def setBMD(value: js.Array[String]): Self = this.set("BMD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBZDVarargs(value: String*): Self = this.set("BZD", js.Array(value :_*))
    @scala.inline
    def setBZD(value: js.Array[String]): Self = this.set("BZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCADVarargs(value: String*): Self = this.set("CAD", js.Array(value :_*))
    @scala.inline
    def setCAD(value: js.Array[String]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPENVarargs(value: String*): Self = this.set("PEN", js.Array(value :_*))
    @scala.inline
    def setPEN(value: js.Array[String]): Self = this.set("PEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

