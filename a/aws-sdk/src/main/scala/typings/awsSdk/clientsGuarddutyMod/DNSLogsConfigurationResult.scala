package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSLogsConfigurationResult extends StObject {
  
  /**
    * Denotes whether DNS logs is enabled as a data source.
    */
  var Status: DataSourceStatus
}
object DNSLogsConfigurationResult {
  
  inline def apply(Status: DataSourceStatus): DNSLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNSLogsConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DNSLogsConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
