package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceStateRequest extends StObject {
  
  /**
    * The name of the instance to get state information about.
    */
  var instanceName: ResourceName
}
object GetInstanceStateRequest {
  
  inline def apply(instanceName: ResourceName): GetInstanceStateRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceStateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceStateRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
