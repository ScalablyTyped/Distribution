package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhishingFilterStatus extends js.Object {
  
  val PhishingFilterStatus: Double = js.native
}
object PhishingFilterStatus {
  
  @scala.inline
  def apply(PhishingFilterStatus: Double): PhishingFilterStatus = {
    val __obj = js.Dynamic.literal(PhishingFilterStatus = PhishingFilterStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhishingFilterStatus]
  }
  
  @scala.inline
  implicit class PhishingFilterStatusOps[Self <: PhishingFilterStatus] (val x: Self) extends AnyVal {
    
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
    def setPhishingFilterStatus(value: Double): Self = this.set("PhishingFilterStatus", value.asInstanceOf[js.Any])
  }
}
