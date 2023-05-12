package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSipMediaApplicationAlexaSkillConfigurationRequest extends StObject {
  
  /**
    * The Alexa Skill configuration.
    */
  var SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationAlexaSkillConfiguration
  ] = js.undefined
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString
}
object PutSipMediaApplicationAlexaSkillConfigurationRequest {
  
  inline def apply(SipMediaApplicationId: NonEmptyString): PutSipMediaApplicationAlexaSkillConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSipMediaApplicationAlexaSkillConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSipMediaApplicationAlexaSkillConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationAlexaSkillConfiguration(value: SipMediaApplicationAlexaSkillConfiguration): Self = StObject.set(x, "SipMediaApplicationAlexaSkillConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationAlexaSkillConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationAlexaSkillConfiguration", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
