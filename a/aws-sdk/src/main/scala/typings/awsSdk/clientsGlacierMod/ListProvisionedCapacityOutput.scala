package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisionedCapacityOutput extends StObject {
  
  /**
    * The response body contains the following JSON fields.
    */
  var ProvisionedCapacityList: js.UndefOr[typings.awsSdk.clientsGlacierMod.ProvisionedCapacityList] = js.undefined
}
object ListProvisionedCapacityOutput {
  
  inline def apply(): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
  
  extension [Self <: ListProvisionedCapacityOutput](x: Self) {
    
    inline def setProvisionedCapacityList(value: ProvisionedCapacityList): Self = StObject.set(x, "ProvisionedCapacityList", value.asInstanceOf[js.Any])
    
    inline def setProvisionedCapacityListUndefined: Self = StObject.set(x, "ProvisionedCapacityList", js.undefined)
    
    inline def setProvisionedCapacityListVarargs(value: ProvisionedCapacityDescription*): Self = StObject.set(x, "ProvisionedCapacityList", js.Array(value*))
  }
}
