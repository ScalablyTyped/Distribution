package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppMonitorRequest extends StObject {
  
  /**
    * The app monitor to retrieve information for.
    */
  var Name: AppMonitorName
}
object GetAppMonitorRequest {
  
  inline def apply(Name: AppMonitorName): GetAppMonitorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppMonitorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAppMonitorRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
