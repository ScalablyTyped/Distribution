package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationAlexaSkillConfigurationRequest extends StObject {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString
}
object GetSipMediaApplicationAlexaSkillConfigurationRequest {
  
  inline def apply(SipMediaApplicationId: NonEmptyString): GetSipMediaApplicationAlexaSkillConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipMediaApplicationAlexaSkillConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSipMediaApplicationAlexaSkillConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
  }
}
