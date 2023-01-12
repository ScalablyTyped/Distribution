package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppMonitorRequest extends StObject {
  
  /**
    * The name of the app monitor to delete.
    */
  var Name: AppMonitorName
}
object DeleteAppMonitorRequest {
  
  inline def apply(Name: AppMonitorName): DeleteAppMonitorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppMonitorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppMonitorRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
