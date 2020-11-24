package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderLocation extends js.Object {
  
  /**
    * Contains actual location info.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * Address type. Determines icon and placement. Required.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderLocationType] = js.native
}
object GoogleActionsV2OrdersOrderLocation {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderLocation]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderLocationOps[Self <: GoogleActionsV2OrdersOrderLocation] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: GoogleActionsV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2OrdersOrderLocationType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
