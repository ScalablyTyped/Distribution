package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMetricPolicyInput extends StObject {
  
  /**
    * The name of the container that is associated with the metric policy that you want to delete.
    */
  var ContainerName: typings.awsSdk.clientsMediastoreMod.ContainerName
}
object DeleteMetricPolicyInput {
  
  inline def apply(ContainerName: ContainerName): DeleteMetricPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMetricPolicyInput]
  }
  
  extension [Self <: DeleteMetricPolicyInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
