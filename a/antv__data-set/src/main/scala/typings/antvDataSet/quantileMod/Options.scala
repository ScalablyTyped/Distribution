package typings.antvDataSet.quantileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.UndefOr[String] = js.native
  
  var field: String = js.native
  
  var fraction: js.UndefOr[Double] = js.native
  
  var groupBy: js.UndefOr[js.Array[String]] = js.native
  
  var p: js.UndefOr[js.Array[Double]] = js.native
}
object Options {
  
  @scala.inline
  def apply(field: String): Options = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setFraction(value: Double): Self = this.set("fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFraction: Self = this.set("fraction", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: String*): Self = this.set("groupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupBy(value: js.Array[String]): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setPVarargs(value: Double*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(value: js.Array[Double]): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
  }
}
