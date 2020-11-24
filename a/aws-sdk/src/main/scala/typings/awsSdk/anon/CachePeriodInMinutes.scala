package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePeriodInMinutes extends js.Object {
  
  var Address: js.UndefOr[String] = js.native
  
  var CachePeriodInMinutes: js.UndefOr[Double] = js.native
}
object CachePeriodInMinutes {
  
  @scala.inline
  def apply(): CachePeriodInMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachePeriodInMinutes]
  }
  
  @scala.inline
  implicit class CachePeriodInMinutesOps[Self <: CachePeriodInMinutes] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    
    @scala.inline
    def setCachePeriodInMinutes(value: Double): Self = this.set("CachePeriodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePeriodInMinutes: Self = this.set("CachePeriodInMinutes", js.undefined)
  }
}
