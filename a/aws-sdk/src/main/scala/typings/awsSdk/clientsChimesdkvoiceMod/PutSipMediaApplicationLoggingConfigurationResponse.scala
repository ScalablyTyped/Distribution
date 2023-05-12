package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSipMediaApplicationLoggingConfigurationResponse extends StObject {
  
  /**
    * The updated logging configuration for the specified SIP media application.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationLoggingConfiguration] = js.undefined
}
object PutSipMediaApplicationLoggingConfigurationResponse {
  
  inline def apply(): PutSipMediaApplicationLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSipMediaApplicationLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
