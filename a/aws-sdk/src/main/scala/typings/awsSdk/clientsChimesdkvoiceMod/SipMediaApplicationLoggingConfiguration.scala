package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipMediaApplicationLoggingConfiguration extends StObject {
  
  /**
    * Enables message logging for the specified SIP media application.
    */
  var EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean] = js.undefined
}
object SipMediaApplicationLoggingConfiguration {
  
  inline def apply(): SipMediaApplicationLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationLoggingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SipMediaApplicationLoggingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEnableSipMediaApplicationMessageLogs(value: Boolean): Self = StObject.set(x, "EnableSipMediaApplicationMessageLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSipMediaApplicationMessageLogsUndefined: Self = StObject.set(x, "EnableSipMediaApplicationMessageLogs", js.undefined)
  }
}
