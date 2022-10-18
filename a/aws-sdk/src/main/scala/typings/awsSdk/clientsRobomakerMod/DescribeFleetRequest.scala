package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
}
object DescribeFleetRequest {
  
  inline def apply(fleet: Arn): DescribeFleetRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetRequest]
  }
  
  extension [Self <: DescribeFleetRequest](x: Self) {
    
    inline def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
  }
}
