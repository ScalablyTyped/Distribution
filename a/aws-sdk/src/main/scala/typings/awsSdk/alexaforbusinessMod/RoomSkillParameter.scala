package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomSkillParameter extends StObject {
  
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
  implicit class RoomSkillParameterMutableBuilder[Self <: RoomSkillParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterKey(value: RoomSkillParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: RoomSkillParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
