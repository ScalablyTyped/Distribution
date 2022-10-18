package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInstanceRequest extends StObject {
  
  /**
    * The name of the instance (a virtual private server) to start.
    */
  var instanceName: ResourceName
}
object StartInstanceRequest {
  
  inline def apply(instanceName: ResourceName): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRequest]
  }
  
  extension [Self <: StartInstanceRequest](x: Self) {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
