package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSipMediaApplicationLoggingConfigurationResponse extends StObject {
  
  /**
    * The logging configuration of the SIP media application.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.SipMediaApplicationLoggingConfiguration] = js.undefined
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
