package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SLL extends js.Object {
  
  var JPY: js.Array[String] = js.native
  
  var SLL: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object SLL {
  
  @scala.inline
  def apply(JPY: js.Array[String], SLL: js.Array[String], USD: js.Array[String]): SLL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SLL = SLL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SLL]
  }
  
  @scala.inline
  implicit class SLLOps[Self <: SLL] (val x: Self) extends AnyVal {
    
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
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSLLVarargs(value: String*): Self = this.set("SLL", js.Array(value :_*))
    
    @scala.inline
    def setSLL(value: js.Array[String]): Self = this.set("SLL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
}
