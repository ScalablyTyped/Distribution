package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipMediaApplicationLoggingConfiguration extends StObject {
  
  /**
    * Enables application message logs for the SIP media application.
    */
  var EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean] = js.undefined
}
object SipMediaApplicationLoggingConfiguration {
  
  inline def apply(): SipMediaApplicationLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationLoggingConfiguration]
  }
  
  extension [Self <: SipMediaApplicationLoggingConfiguration](x: Self) {
    
    inline def setEnableSipMediaApplicationMessageLogs(value: Boolean): Self = StObject.set(x, "EnableSipMediaApplicationMessageLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSipMediaApplicationMessageLogsUndefined: Self = StObject.set(x, "EnableSipMediaApplicationMessageLogs", js.undefined)
  }
}
