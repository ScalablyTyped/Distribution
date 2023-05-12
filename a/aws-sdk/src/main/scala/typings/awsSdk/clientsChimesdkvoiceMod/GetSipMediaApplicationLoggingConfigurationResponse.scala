package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationLoggingConfigurationResponse extends StObject {
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationLoggingConfiguration] = js.undefined
}
object GetSipMediaApplicationLoggingConfigurationResponse {
  
  inline def apply(): GetSipMediaApplicationLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSipMediaApplicationLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationLoggingConfigurationUndefined: Self = StObject.set(x, "SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
