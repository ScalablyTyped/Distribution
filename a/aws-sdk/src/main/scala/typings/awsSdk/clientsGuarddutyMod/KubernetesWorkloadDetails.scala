package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesWorkloadDetails extends StObject {
  
  /**
    * Containers running as part of the Kubernetes workload.
    */
  var Containers: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Containers] = js.undefined
  
  /**
    * Whether the hostNetwork flag is enabled for the pods included in the workload.
    */
  var HostNetwork: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Kubernetes workload name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Kubernetes namespace that the workload is part of.
    */
  var Namespace: js.UndefOr[String] = js.undefined
  
  /**
    * Kubernetes workload type (e.g. Pod, Deployment, etc.).
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * Kubernetes workload ID.
    */
  var Uid: js.UndefOr[String] = js.undefined
  
  /**
    * Volumes used by the Kubernetes workload.
    */
  var Volumes: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Volumes] = js.undefined
}
object KubernetesWorkloadDetails {
  
  inline def apply(): KubernetesWorkloadDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesWorkloadDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KubernetesWorkloadDetails] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: Containers): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setHostNetwork(value: Boolean): Self = StObject.set(x, "HostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostNetworkUndefined: Self = StObject.set(x, "HostNetwork", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
    
    inline def setVolumes(value: Volumes): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "Volumes", js.Array(value*))
  }
}
