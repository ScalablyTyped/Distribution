package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipMediaApplicationLoggingConfiguration extends StObject {
  
  /**
    * Enables application message logs for the SIP media application.
    */
  var EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean] = js.native
}
object SipMediaApplicationLoggingConfiguration {
  
  @scala.inline
  def apply(): SipMediaApplicationLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationLoggingConfiguration]
  }
  
  @scala.inline
  implicit class SipMediaApplicationLoggingConfigurationMutableBuilder[Self <: SipMediaApplicationLoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableSipMediaApplicationMessageLogs(value: Boolean): Self = StObject.set(x, "EnableSipMediaApplicationMessageLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSipMediaApplicationMessageLogsUndefined: Self = StObject.set(x, "EnableSipMediaApplicationMessageLogs", js.undefined)
  }
}
