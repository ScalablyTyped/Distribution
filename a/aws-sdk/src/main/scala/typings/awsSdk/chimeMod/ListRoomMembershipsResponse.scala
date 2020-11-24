package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoomMembershipsResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The room membership details.
    */
  var RoomMemberships: js.UndefOr[RoomMembershipList] = js.native
}
object ListRoomMembershipsResponse {
  
  @scala.inline
  def apply(): ListRoomMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoomMembershipsResponse]
  }
  
  @scala.inline
  implicit class ListRoomMembershipsResponseOps[Self <: ListRoomMembershipsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRoomMembershipsVarargs(value: RoomMembership*): Self = this.set("RoomMemberships", js.Array(value :_*))
    
    @scala.inline
    def setRoomMemberships(value: RoomMembershipList): Self = this.set("RoomMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomMemberships: Self = this.set("RoomMemberships", js.undefined)
  }
}
