package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FJDJPY extends js.Object {
  
  var AUD: js.Array[String] = js.native
  
  var CAD: js.Array[String] = js.native
  
  var FJD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var SBD: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var XPF: js.Array[scala.Nothing] = js.native
  
  var XXX: js.Array[scala.Nothing] = js.native
}
object FJDJPY {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CAD: js.Array[String],
    FJD: js.Array[String],
    JPY: js.Array[String],
    SBD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    XPF: js.Array[scala.Nothing],
    XXX: js.Array[scala.Nothing]
  ): FJDJPY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], XPF = XPF.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[FJDJPY]
  }
  
  @scala.inline
  implicit class FJDJPYOps[Self <: FJDJPY] (val x: Self) extends AnyVal {
    
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
    def setAUDVarargs(value: String*): Self = this.set("AUD", js.Array(value :_*))
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADVarargs(value: String*): Self = this.set("CAD", js.Array(value :_*))
    
    @scala.inline
    def setCAD(value: js.Array[String]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFJDVarargs(value: String*): Self = this.set("FJD", js.Array(value :_*))
    
    @scala.inline
    def setFJD(value: js.Array[String]): Self = this.set("FJD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSBDVarargs(value: String*): Self = this.set("SBD", js.Array(value :_*))
    
    @scala.inline
    def setSBD(value: js.Array[String]): Self = this.set("SBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPFVarargs(value: scala.Nothing*): Self = this.set("XPF", js.Array(value :_*))
    
    @scala.inline
    def setXPF(value: js.Array[scala.Nothing]): Self = this.set("XPF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = this.set("XXX", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
}
