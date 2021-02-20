package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfiguration extends StObject {
  
  /**
    * When true, enables SIP message logs for sending to Amazon CloudWatch Logs.
    */
  var EnableSIPLogs: js.UndefOr[Boolean] = js.native
}
object LoggingConfiguration {
  
  @scala.inline
  def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit class LoggingConfigurationMutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableSIPLogs(value: Boolean): Self = StObject.set(x, "EnableSIPLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSIPLogsUndefined: Self = StObject.set(x, "EnableSIPLogs", js.undefined)
  }
}
