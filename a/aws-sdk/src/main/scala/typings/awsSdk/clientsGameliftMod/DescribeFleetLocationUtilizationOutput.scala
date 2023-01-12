package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetLocationUtilizationOutput extends StObject {
  
  /**
    * Utilization information for the requested fleet location. Utilization objects are returned only for fleets and locations that currently exist.
    */
  var FleetUtilization: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetUtilization] = js.undefined
}
object DescribeFleetLocationUtilizationOutput {
  
  inline def apply(): DescribeFleetLocationUtilizationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetLocationUtilizationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetLocationUtilizationOutput] (val x: Self) extends AnyVal {
    
    inline def setFleetUtilization(value: FleetUtilization): Self = StObject.set(x, "FleetUtilization", value.asInstanceOf[js.Any])
    
    inline def setFleetUtilizationUndefined: Self = StObject.set(x, "FleetUtilization", js.undefined)
  }
}
