package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomSkillParameter extends js.Object {
  
  /**
    * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
    */
  var ParameterKey: RoomSkillParameterKey = js.native
  
  /**
    * The parameter value of a room skill parameter.
    */
  var ParameterValue: RoomSkillParameterValue = js.native
}
object RoomSkillParameter {
  
  @scala.inline
  def apply(ParameterKey: RoomSkillParameterKey, ParameterValue: RoomSkillParameterValue): RoomSkillParameter = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSkillParameter]
  }
  
  @scala.inline
  implicit class RoomSkillParameterOps[Self <: RoomSkillParameter] (val x: Self) extends AnyVal {
    
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
    def setParameterKey(value: RoomSkillParameterKey): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: RoomSkillParameterValue): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
  }
}
