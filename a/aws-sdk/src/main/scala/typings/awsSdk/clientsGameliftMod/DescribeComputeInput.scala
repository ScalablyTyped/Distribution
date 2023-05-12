package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComputeInput extends StObject {
  
  /**
    * A descriptive label that is associated with the compute resource registered to your fleet.
    */
  var ComputeName: ComputeNameOrArn
  
  /**
    * A unique identifier for the fleet the compute is registered to.
    */
  var FleetId: FleetIdOrArn
}
object DescribeComputeInput {
  
  inline def apply(ComputeName: ComputeNameOrArn, FleetId: FleetIdOrArn): DescribeComputeInput = {
    val __obj = js.Dynamic.literal(ComputeName = ComputeName.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComputeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeComputeInput] (val x: Self) extends AnyVal {
    
    inline def setComputeName(value: ComputeNameOrArn): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
