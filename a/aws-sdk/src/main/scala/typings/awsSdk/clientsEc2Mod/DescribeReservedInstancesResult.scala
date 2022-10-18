package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstancesResult extends StObject {
  
  /**
    * A list of Reserved Instances.
    */
  var ReservedInstances: js.UndefOr[ReservedInstancesList] = js.undefined
}
object DescribeReservedInstancesResult {
  
  inline def apply(): DescribeReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesResult]
  }
  
  extension [Self <: DescribeReservedInstancesResult](x: Self) {
    
    inline def setReservedInstances(value: ReservedInstancesList): Self = StObject.set(x, "ReservedInstances", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesUndefined: Self = StObject.set(x, "ReservedInstances", js.undefined)
    
    inline def setReservedInstancesVarargs(value: ReservedInstances*): Self = StObject.set(x, "ReservedInstances", js.Array(value*))
  }
}
