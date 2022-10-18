package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDistributionRequest extends StObject {
  
  /**
    * The name of the distribution to delete. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: js.UndefOr[ResourceName] = js.undefined
}
object DeleteDistributionRequest {
  
  inline def apply(): DeleteDistributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDistributionRequest]
  }
  
  extension [Self <: DeleteDistributionRequest](x: Self) {
    
    inline def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    inline def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
  }
}
