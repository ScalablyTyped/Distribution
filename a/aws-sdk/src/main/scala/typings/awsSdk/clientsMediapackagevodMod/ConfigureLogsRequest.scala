package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureLogsRequest extends StObject {
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.EgressAccessLogs] = js.undefined
  
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string
}
object ConfigureLogsRequest {
  
  inline def apply(Id: string): ConfigureLogsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureLogsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigureLogsRequest] (val x: Self) extends AnyVal {
    
    inline def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
