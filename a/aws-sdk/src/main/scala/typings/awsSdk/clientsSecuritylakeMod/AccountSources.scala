package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSources extends StObject {
  
  /**
    * The ID of the Security Lake account for which logs are collected.
    */
  var account: String
  
  /**
    * Initializes a new instance of the Event class.
    */
  var eventClass: js.UndefOr[OcsfEventClass] = js.undefined
  
  /**
    * The log status for the Security Lake account.
    */
  var logsStatus: js.UndefOr[LogsStatusList] = js.undefined
  
  /**
    * The supported Amazon Web Services from which logs and events are collected. Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. 
    */
  var sourceType: String
}
object AccountSources {
  
  inline def apply(account: String, sourceType: String): AccountSources = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSources] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setEventClass(value: OcsfEventClass): Self = StObject.set(x, "eventClass", value.asInstanceOf[js.Any])
    
    inline def setEventClassUndefined: Self = StObject.set(x, "eventClass", js.undefined)
    
    inline def setLogsStatus(value: LogsStatusList): Self = StObject.set(x, "logsStatus", value.asInstanceOf[js.Any])
    
    inline def setLogsStatusUndefined: Self = StObject.set(x, "logsStatus", js.undefined)
    
    inline def setLogsStatusVarargs(value: LogsStatus*): Self = StObject.set(x, "logsStatus", js.Array(value*))
    
    inline def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
  }
}
