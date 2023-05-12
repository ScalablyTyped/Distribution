package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksPodProperties extends StObject {
  
  /**
    * The properties of the container that's used on the Amazon EKS pod.
    */
  var containers: js.UndefOr[EksContainers] = js.undefined
  
  /**
    * The DNS policy for the pod. The default value is ClusterFirst. If the hostNetwork parameter is not specified, the default is ClusterFirstWithHostNet. ClusterFirst indicates that any DNS query that does not match the configured cluster domain suffix is forwarded to the upstream nameserver inherited from the node. For more information, see Pod's DNS policy in the Kubernetes documentation. Valid values: Default | ClusterFirst | ClusterFirstWithHostNet 
    */
  var dnsPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the pod uses the hosts' network IP address. The default value is true. Setting this to false enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't require the overhead of IP allocation for each pod for incoming connections. For more information, see Host namespaces and Pod networking in the Kubernetes documentation.
    */
  var hostNetwork: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Metadata about the Kubernetes pod. For more information, see Understanding Kubernetes Objects in the Kubernetes documentation.
    */
  var metadata: js.UndefOr[EksMetadata] = js.undefined
  
  /**
    * The name of the service account that's used to run the pod. For more information, see Kubernetes service accounts and Configure a Kubernetes service account to assume an IAM role in the Amazon EKS User Guide and Configure service accounts for pods in the Kubernetes documentation.
    */
  var serviceAccountName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the volumes for a job definition that uses Amazon EKS resources.
    */
  var volumes: js.UndefOr[EksVolumes] = js.undefined
}
object EksPodProperties {
  
  inline def apply(): EksPodProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksPodProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksPodProperties] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: EksContainers): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: EksContainer*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setDnsPolicy(value: String): Self = StObject.set(x, "dnsPolicy", value.asInstanceOf[js.Any])
    
    inline def setDnsPolicyUndefined: Self = StObject.set(x, "dnsPolicy", js.undefined)
    
    inline def setHostNetwork(value: Boolean): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostNetworkUndefined: Self = StObject.set(x, "hostNetwork", js.undefined)
    
    inline def setMetadata(value: EksMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setVolumes(value: EksVolumes): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: EksVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
