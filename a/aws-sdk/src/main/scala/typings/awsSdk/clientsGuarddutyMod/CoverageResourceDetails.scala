package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageResourceDetails extends StObject {
  
  /**
    * EKS cluster details involved in the coverage statistics.
    */
  var EksClusterDetails: js.UndefOr[CoverageEksClusterDetails] = js.undefined
  
  /**
    * The type of Amazon Web Services resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ResourceType] = js.undefined
}
object CoverageResourceDetails {
  
  inline def apply(): CoverageResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setEksClusterDetails(value: CoverageEksClusterDetails): Self = StObject.set(x, "EksClusterDetails", value.asInstanceOf[js.Any])
    
    inline def setEksClusterDetailsUndefined: Self = StObject.set(x, "EksClusterDetails", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
