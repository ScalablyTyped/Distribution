package typings.ackeeTracker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultData extends js.Object {
  
  var siteLocation: String = js.native
  
  var siteReferrer: String = js.native
}
object DefaultData {
  
  @scala.inline
  def apply(siteLocation: String, siteReferrer: String): DefaultData = {
    val __obj = js.Dynamic.literal(siteLocation = siteLocation.asInstanceOf[js.Any], siteReferrer = siteReferrer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultData]
  }
  
  @scala.inline
  implicit class DefaultDataOps[Self <: DefaultData] (val x: Self) extends AnyVal {
    
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
    def setSiteLocation(value: String): Self = this.set("siteLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteReferrer(value: String): Self = this.set("siteReferrer", value.asInstanceOf[js.Any])
  }
}
