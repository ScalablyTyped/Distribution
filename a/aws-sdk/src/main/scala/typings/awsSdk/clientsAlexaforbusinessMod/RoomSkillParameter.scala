package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomSkillParameter extends StObject {
  
  /**
    * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
    */
  var ParameterKey: RoomSkillParameterKey
  
  /**
    * The parameter value of a room skill parameter.
    */
  var ParameterValue: RoomSkillParameterValue
}
object RoomSkillParameter {
  
  inline def apply(ParameterKey: RoomSkillParameterKey, ParameterValue: RoomSkillParameterValue): RoomSkillParameter = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSkillParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomSkillParameter] (val x: Self) extends AnyVal {
    
    inline def setParameterKey(value: RoomSkillParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    inline def setParameterValue(value: RoomSkillParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
  }
}
