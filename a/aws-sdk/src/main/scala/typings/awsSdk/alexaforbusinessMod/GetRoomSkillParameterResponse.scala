package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRoomSkillParameterResponse extends js.Object {
  
  /**
    * The details of the room skill parameter requested. Required.
    */
  var RoomSkillParameter: js.UndefOr[typings.awsSdk.alexaforbusinessMod.RoomSkillParameter] = js.native
}
object GetRoomSkillParameterResponse {
  
  @scala.inline
  def apply(): GetRoomSkillParameterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRoomSkillParameterResponse]
  }
  
  @scala.inline
  implicit class GetRoomSkillParameterResponseOps[Self <: GetRoomSkillParameterResponse] (val x: Self) extends AnyVal {
    
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
    def setRoomSkillParameter(value: RoomSkillParameter): Self = this.set("RoomSkillParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomSkillParameter: Self = this.set("RoomSkillParameter", js.undefined)
  }
}
