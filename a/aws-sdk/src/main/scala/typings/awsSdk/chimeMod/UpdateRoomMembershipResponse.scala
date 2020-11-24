package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoomMembershipResponse extends js.Object {
  
  /**
    * The room membership details.
    */
  var RoomMembership: js.UndefOr[typings.awsSdk.chimeMod.RoomMembership] = js.native
}
object UpdateRoomMembershipResponse {
  
  @scala.inline
  def apply(): UpdateRoomMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomMembershipResponse]
  }
  
  @scala.inline
  implicit class UpdateRoomMembershipResponseOps[Self <: UpdateRoomMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoomMembership(value: RoomMembership): Self = this.set("RoomMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomMembership: Self = this.set("RoomMembership", js.undefined)
  }
}
