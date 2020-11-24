package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BYNDKK extends js.Object {
  
  var BYN: js.Array[js.UndefOr[String]] = js.native
  
  var DKK: js.Array[js.UndefOr[String]] = js.native
  
  var HRK: js.Array[js.UndefOr[String]] = js.native
  
  var ISK: js.Array[js.UndefOr[String]] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var NOK: js.Array[js.UndefOr[String]] = js.native
  
  var PLN: js.Array[js.UndefOr[String]] = js.native
  
  var SEK: js.Array[js.UndefOr[String]] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var ZAR: js.Array[String] = js.native
}
object BYNDKK {
  
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    DKK: js.Array[js.UndefOr[String]],
    HRK: js.Array[js.UndefOr[String]],
    ISK: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NOK: js.Array[js.UndefOr[String]],
    PLN: js.Array[js.UndefOr[String]],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    ZAR: js.Array[String]
  ): BYNDKK = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], HRK = HRK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNDKK]
  }
  
  @scala.inline
  implicit class BYNDKKOps[Self <: BYNDKK] (val x: Self) extends AnyVal {
    
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
    def setBYNVarargs(value: js.UndefOr[String]*): Self = this.set("BYN", js.Array(value :_*))
    
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDKKVarargs(value: js.UndefOr[String]*): Self = this.set("DKK", js.Array(value :_*))
    
    @scala.inline
    def setDKK(value: js.Array[js.UndefOr[String]]): Self = this.set("DKK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHRKVarargs(value: js.UndefOr[String]*): Self = this.set("HRK", js.Array(value :_*))
    
    @scala.inline
    def setHRK(value: js.Array[js.UndefOr[String]]): Self = this.set("HRK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISKVarargs(value: js.UndefOr[String]*): Self = this.set("ISK", js.Array(value :_*))
    
    @scala.inline
    def setISK(value: js.Array[js.UndefOr[String]]): Self = this.set("ISK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOKVarargs(value: js.UndefOr[String]*): Self = this.set("NOK", js.Array(value :_*))
    
    @scala.inline
    def setNOK(value: js.Array[js.UndefOr[String]]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLNVarargs(value: js.UndefOr[String]*): Self = this.set("PLN", js.Array(value :_*))
    
    @scala.inline
    def setPLN(value: js.Array[js.UndefOr[String]]): Self = this.set("PLN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSEKVarargs(value: js.UndefOr[String]*): Self = this.set("SEK", js.Array(value :_*))
    
    @scala.inline
    def setSEK(value: js.Array[js.UndefOr[String]]): Self = this.set("SEK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZARVarargs(value: String*): Self = this.set("ZAR", js.Array(value :_*))
    
    @scala.inline
    def setZAR(value: js.Array[String]): Self = this.set("ZAR", value.asInstanceOf[js.Any])
  }
}
