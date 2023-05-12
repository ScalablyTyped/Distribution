package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterComputeInput extends StObject {
  
  /**
    * The name of the compute resource you want to delete.
    */
  var ComputeName: ComputeNameOrArn
  
  /**
    * &gt;A unique identifier for the fleet the compute resource is registered to.
    */
  var FleetId: FleetIdOrArn
}
object DeregisterComputeInput {
  
  inline def apply(ComputeName: ComputeNameOrArn, FleetId: FleetIdOrArn): DeregisterComputeInput = {
    val __obj = js.Dynamic.literal(ComputeName = ComputeName.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterComputeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterComputeInput] (val x: Self) extends AnyVal {
    
    inline def setComputeName(value: ComputeNameOrArn): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
