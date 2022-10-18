package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceRequest extends StObject {
  
  /**
    * The name of the instance.
    */
  var instanceName: ResourceName
}
object GetInstanceRequest {
  
  inline def apply(instanceName: ResourceName): GetInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceRequest]
  }
  
  extension [Self <: GetInstanceRequest](x: Self) {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
