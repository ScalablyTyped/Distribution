package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BWP extends js.Object {
  
  var BDT: js.Array[js.UndefOr[String]] = js.native
  
  var BWP: js.Array[scala.Nothing] = js.native
  
  var HKD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var KRW: js.Array[js.UndefOr[String]] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var XXX: js.Array[scala.Nothing] = js.native
  
  var ZAR: js.Array[scala.Nothing] = js.native
  
  var ZMW: js.Array[scala.Nothing] = js.native
}
object BWP {
  
  @scala.inline
  def apply(
    BDT: js.Array[js.UndefOr[String]],
    BWP: js.Array[scala.Nothing],
    HKD: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing],
    ZAR: js.Array[scala.Nothing],
    ZMW: js.Array[scala.Nothing]
  ): BWP = {
    val __obj = js.Dynamic.literal(BDT = BDT.asInstanceOf[js.Any], BWP = BWP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[BWP]
  }
  
  @scala.inline
  implicit class BWPOps[Self <: BWP] (val x: Self) extends AnyVal {
    
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
    def setBDTVarargs(value: js.UndefOr[String]*): Self = this.set("BDT", js.Array(value :_*))
    
    @scala.inline
    def setBDT(value: js.Array[js.UndefOr[String]]): Self = this.set("BDT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBWPVarargs(value: scala.Nothing*): Self = this.set("BWP", js.Array(value :_*))
    
    @scala.inline
    def setBWP(value: js.Array[scala.Nothing]): Self = this.set("BWP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHKDVarargs(value: String*): Self = this.set("HKD", js.Array(value :_*))
    
    @scala.inline
    def setHKD(value: js.Array[String]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: js.UndefOr[String]*): Self = this.set("KRW", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = this.set("XXX", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = this.set("XXX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZARVarargs(value: scala.Nothing*): Self = this.set("ZAR", js.Array(value :_*))
    
    @scala.inline
    def setZAR(value: js.Array[scala.Nothing]): Self = this.set("ZAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZMWVarargs(value: scala.Nothing*): Self = this.set("ZMW", js.Array(value :_*))
    
    @scala.inline
    def setZMW(value: js.Array[scala.Nothing]): Self = this.set("ZMW", value.asInstanceOf[js.Any])
  }
}
