package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionBundleRequest extends StObject {
  
  /**
    * The bundle ID of the new bundle to apply to your distribution. Use the GetDistributionBundles action to get a list of distribution bundle IDs that you can specify.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the distribution for which to update the bundle. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: js.UndefOr[ResourceName] = js.undefined
}
object UpdateDistributionBundleRequest {
  
  inline def apply(): UpdateDistributionBundleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionBundleRequest]
  }
  
  extension [Self <: UpdateDistributionBundleRequest](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    inline def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
  }
}
