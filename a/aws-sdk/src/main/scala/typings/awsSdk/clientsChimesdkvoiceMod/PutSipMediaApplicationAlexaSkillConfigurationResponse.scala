package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSipMediaApplicationAlexaSkillConfigurationResponse extends StObject {
  
  /**
    * Returns the Alexa Skill configuration.
    */
  var SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[
    typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationAlexaSkillConfiguration
  ] = js.undefined
}
object PutSipMediaApplicationAlexaSkillConfigurationResponse {
  
  inline def apply(): PutSipMediaApplicationAlexaSkillConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSipMediaApplicationAlexaSkillConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSipMediaApplicationAlexaSkillConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationAlexaSkillConfiguration(value: SipMediaApplicationAlexaSkillConfiguration): Self = StObject.set(x, "SipMediaApplicationAlexaSkillConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationAlexaSkillConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationAlexaSkillConfiguration", js.undefined)
  }
}
