package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSipMediaApplicationLoggingConfigurationRequest extends StObject {
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: NonEmptyString
  
  /**
    * The logging configuration for the specified SIP media application.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationLoggingConfiguration] = js.undefined
}
object PutSipMediaApplicationLoggingConfigurationRequest {
  
  inline def apply(SipMediaApplicationId: NonEmptyString): PutSipMediaApplicationLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSipMediaApplicationLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
