package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationAlexaSkillConfigurationResponse extends StObject {
  
  /**
    * Returns the Alexa Skill configuration.
    */
  var SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationAlexaSkillConfiguration
  ] = js.undefined
}
object GetSipMediaApplicationAlexaSkillConfigurationResponse {
  
  inline def apply(): GetSipMediaApplicationAlexaSkillConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationAlexaSkillConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSipMediaApplicationAlexaSkillConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationAlexaSkillConfiguration(value: SipMediaApplicationAlexaSkillConfiguration): Self = StObject.set(x, "SipMediaApplicationAlexaSkillConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationAlexaSkillConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationAlexaSkillConfiguration", js.undefined)
  }
}
