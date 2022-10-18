package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterOnPremisesInstanceInput extends StObject {
  
  /**
    * The name of the on-premises instance to deregister.
    */
  var instanceName: InstanceName
}
object DeregisterOnPremisesInstanceInput {
  
  inline def apply(instanceName: InstanceName): DeregisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterOnPremisesInstanceInput]
  }
  
  extension [Self <: DeregisterOnPremisesInstanceInput](x: Self) {
    
    inline def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
