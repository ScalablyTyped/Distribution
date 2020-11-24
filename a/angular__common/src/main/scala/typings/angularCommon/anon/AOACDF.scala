package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AOACDF extends js.Object {
  
  var AOA: js.Array[String] = js.native
  
  var CDF: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object AOACDF {
  
  @scala.inline
  def apply(AOA: js.Array[String], CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AOACDF = {
    val __obj = js.Dynamic.literal(AOA = AOA.asInstanceOf[js.Any], CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AOACDF]
  }
  
  @scala.inline
  implicit class AOACDFOps[Self <: AOACDF] (val x: Self) extends AnyVal {
    
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
    def setAOAVarargs(value: String*): Self = this.set("AOA", js.Array(value :_*))
    
    @scala.inline
    def setAOA(value: js.Array[String]): Self = this.set("AOA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCDFVarargs(value: String*): Self = this.set("CDF", js.Array(value :_*))
    
    @scala.inline
    def setCDF(value: js.Array[String]): Self = this.set("CDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
}
