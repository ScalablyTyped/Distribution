package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GHSNGN extends js.Object {
  
  var GHS: js.Array[String] = js.native
  
  var NGN: js.Array[String] = js.native
}
object GHSNGN {
  
  @scala.inline
  def apply(GHS: js.Array[String], NGN: js.Array[String]): GHSNGN = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHSNGN]
  }
  
  @scala.inline
  implicit class GHSNGNOps[Self <: GHSNGN] (val x: Self) extends AnyVal {
    
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
    def setGHSVarargs(value: String*): Self = this.set("GHS", js.Array(value :_*))
    
    @scala.inline
    def setGHS(value: js.Array[String]): Self = this.set("GHS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNGNVarargs(value: String*): Self = this.set("NGN", js.Array(value :_*))
    
    @scala.inline
    def setNGN(value: js.Array[String]): Self = this.set("NGN", value.asInstanceOf[js.Any])
  }
}
