package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesDetails extends StObject {
  
  /**
    * Details about the Kubernetes user involved in a Kubernetes finding.
    */
  var KubernetesUserDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.KubernetesUserDetails] = js.undefined
  
  /**
    * Details about the Kubernetes workload involved in a Kubernetes finding.
    */
  var KubernetesWorkloadDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.KubernetesWorkloadDetails] = js.undefined
}
object KubernetesDetails {
  
  inline def apply(): KubernetesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KubernetesDetails] (val x: Self) extends AnyVal {
    
    inline def setKubernetesUserDetails(value: KubernetesUserDetails): Self = StObject.set(x, "KubernetesUserDetails", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUserDetailsUndefined: Self = StObject.set(x, "KubernetesUserDetails", js.undefined)
    
    inline def setKubernetesWorkloadDetails(value: KubernetesWorkloadDetails): Self = StObject.set(x, "KubernetesWorkloadDetails", value.asInstanceOf[js.Any])
    
    inline def setKubernetesWorkloadDetailsUndefined: Self = StObject.set(x, "KubernetesWorkloadDetails", js.undefined)
  }
}
