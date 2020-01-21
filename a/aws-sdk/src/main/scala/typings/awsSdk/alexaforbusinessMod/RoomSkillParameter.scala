package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

