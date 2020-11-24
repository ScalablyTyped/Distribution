package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DKK extends js.Object {
  
  var AUD: js.Array[String] = js.native
  
  var DKK: js.Array[String] = js.native
  
  var ISK: js.Array[js.UndefOr[String]] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var NOK: js.Array[js.UndefOr[String]] = js.native
  
  var RON: js.Array[js.UndefOr[String]] = js.native
  
  var SEK: js.Array[js.UndefOr[String]] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object DKK {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    DKK: js.Array[String],
    ISK: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NOK: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): DKK = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], DKK = DKK.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKK]
  }
  
  @scala.inline
  implicit class DKKOps[Self <: DKK] (val x: Self) extends AnyVal {
    
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
    def setDKKVarargs(value: String*): Self = this.set("DKK", js.Array(value :_*))
    
    @scala.inline
    def setDKK(value: js.Array[String]): Self = this.set("DKK", value.asInstanceOf[js.Any])
    
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
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    
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
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
}
