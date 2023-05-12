package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComputeAuthTokenInput extends StObject {
  
  /**
    * The name of the compute resource you are requesting the authentication token for.
    */
  var ComputeName: ComputeNameOrArn
  
  /**
    * A unique identifier for the fleet that the compute is registered to.
    */
  var FleetId: FleetIdOrArn
}
object GetComputeAuthTokenInput {
  
  inline def apply(ComputeName: ComputeNameOrArn, FleetId: FleetIdOrArn): GetComputeAuthTokenInput = {
    val __obj = js.Dynamic.literal(ComputeName = ComputeName.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputeAuthTokenInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComputeAuthTokenInput] (val x: Self) extends AnyVal {
    
    inline def setComputeName(value: ComputeNameOrArn): Self = StObject.set(x, "ComputeName", value.asInstanceOf[js.Any])
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
