package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSipMediaApplicationLoggingConfigurationRequest extends StObject {
  
  /**
    * The ID of the specified SIP media application
    */
  var SipMediaApplicationId: NonEmptyString
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplicationLoggingConfiguration] = js.undefined
}
object PutSipMediaApplicationLoggingConfigurationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): PutSipMediaApplicationLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutSipMediaApplicationLoggingConfigurationRequestMutableBuilder[Self <: PutSipMediaApplicationLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
