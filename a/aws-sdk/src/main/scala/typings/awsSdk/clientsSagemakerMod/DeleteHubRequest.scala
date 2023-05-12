package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHubRequest extends StObject {
  
  /**
    * The name of the hub to delete.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
}
object DeleteHubRequest {
  
  inline def apply(HubName: HubName): DeleteHubRequest = {
    val __obj = js.Dynamic.literal(HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHubRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHubRequest] (val x: Self) extends AnyVal {
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
  }
}
