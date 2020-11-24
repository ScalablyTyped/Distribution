package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ATSArray extends js.Object {
  
  var ATS: js.Array[String] = js.native
}
object ATSArray {
  
  @scala.inline
  def apply(ATS: js.Array[String]): ATSArray = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATSArray]
  }
  
  @scala.inline
  implicit class ATSArrayOps[Self <: ATSArray] (val x: Self) extends AnyVal {
    
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
    def setATSVarargs(value: String*): Self = this.set("ATS", js.Array(value :_*))
    
    @scala.inline
    def setATS(value: js.Array[String]): Self = this.set("ATS", value.asInstanceOf[js.Any])
  }
}
