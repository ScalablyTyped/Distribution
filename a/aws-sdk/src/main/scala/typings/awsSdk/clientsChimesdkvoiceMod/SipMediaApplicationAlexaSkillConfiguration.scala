package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipMediaApplicationAlexaSkillConfiguration extends StObject {
  
  /**
    * The ID of the Alexa Skill configuration.
    */
  var AlexaSkillIds: AlexaSkillIdList
  
  /**
    * The status of the Alexa Skill configuration.
    */
  var AlexaSkillStatus: typings.awsSdk.clientsChimesdkvoiceMod.AlexaSkillStatus
}
object SipMediaApplicationAlexaSkillConfiguration {
  
  inline def apply(AlexaSkillIds: AlexaSkillIdList, AlexaSkillStatus: AlexaSkillStatus): SipMediaApplicationAlexaSkillConfiguration = {
    val __obj = js.Dynamic.literal(AlexaSkillIds = AlexaSkillIds.asInstanceOf[js.Any], AlexaSkillStatus = AlexaSkillStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SipMediaApplicationAlexaSkillConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SipMediaApplicationAlexaSkillConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlexaSkillIds(value: AlexaSkillIdList): Self = StObject.set(x, "AlexaSkillIds", value.asInstanceOf[js.Any])
    
    inline def setAlexaSkillIdsVarargs(value: AlexaSkillId*): Self = StObject.set(x, "AlexaSkillIds", js.Array(value*))
    
    inline def setAlexaSkillStatus(value: AlexaSkillStatus): Self = StObject.set(x, "AlexaSkillStatus", value.asInstanceOf[js.Any])
  }
}
