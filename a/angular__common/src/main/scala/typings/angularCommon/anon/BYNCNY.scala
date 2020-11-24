package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BYNCNY extends js.Object {
  
  var BYN: js.Array[js.UndefOr[String]] = js.native
  
  var CNY: js.Array[String] = js.native
  
  var ILP: js.Array[String] = js.native
  
  var THB: js.Array[String] = js.native
  
  var TWD: js.Array[String] = js.native
}
object BYNCNY {
  
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    CNY: js.Array[String],
    ILP: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): BYNCNY = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], ILP = ILP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNCNY]
  }
  
  @scala.inline
  implicit class BYNCNYOps[Self <: BYNCNY] (val x: Self) extends AnyVal {
    
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
    def setCNYVarargs(value: String*): Self = this.set("CNY", js.Array(value :_*))
    
    @scala.inline
    def setCNY(value: js.Array[String]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILPVarargs(value: String*): Self = this.set("ILP", js.Array(value :_*))
    
    @scala.inline
    def setILP(value: js.Array[String]): Self = this.set("ILP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
}
