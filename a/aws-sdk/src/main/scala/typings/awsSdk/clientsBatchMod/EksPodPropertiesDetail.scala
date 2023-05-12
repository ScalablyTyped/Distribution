package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksPodPropertiesDetail extends StObject {
  
  /**
    * The properties of the container that's used on the Amazon EKS pod.
    */
  var containers: js.UndefOr[EksContainerDetails] = js.undefined
  
  /**
    * The DNS policy for the pod. The default value is ClusterFirst. If the hostNetwork parameter is not specified, the default is ClusterFirstWithHostNet. ClusterFirst indicates that any DNS query that does not match the configured cluster domain suffix is forwarded to the upstream nameserver inherited from the node. If no value was specified for dnsPolicy in the RegisterJobDefinition API operation, then no value will be returned for dnsPolicy by either of DescribeJobDefinitions or DescribeJobs API operations. The pod spec setting will contain either ClusterFirst or ClusterFirstWithHostNet, depending on the value of the hostNetwork parameter. For more information, see Pod's DNS policy in the Kubernetes documentation. Valid values: Default | ClusterFirst | ClusterFirstWithHostNet 
    */
  var dnsPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the pod uses the hosts' network IP address. The default value is true. Setting this to false enables the Kubernetes pod networking model. Most Batch workloads are egress-only and don't require the overhead of IP allocation for each pod for incoming connections. For more information, see Host namespaces and Pod networking in the Kubernetes documentation.
    */
  var hostNetwork: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[EksMetadata] = js.undefined
  
  /**
    * The name of the node for this job.
    */
  var nodeName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the pod for this job.
    */
  var podName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service account that's used to run the pod. For more information, see Kubernetes service accounts and Configure a Kubernetes service account to assume an IAM role in the Amazon EKS User Guide and Configure service accounts for pods in the Kubernetes documentation.
    */
  var serviceAccountName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the volumes for a job definition using Amazon EKS resources.
    */
  var volumes: js.UndefOr[EksVolumes] = js.undefined
}
object EksPodPropertiesDetail {
  
  inline def apply(): EksPodPropertiesDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksPodPropertiesDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksPodPropertiesDetail] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: EksContainerDetails): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: EksContainerDetail*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setDnsPolicy(value: String): Self = StObject.set(x, "dnsPolicy", value.asInstanceOf[js.Any])
    
    inline def setDnsPolicyUndefined: Self = StObject.set(x, "dnsPolicy", js.undefined)
    
    inline def setHostNetwork(value: Boolean): Self = StObject.set(x, "hostNetwork", value.asInstanceOf[js.Any])
    
    inline def setHostNetworkUndefined: Self = StObject.set(x, "hostNetwork", js.undefined)
    
    inline def setMetadata(value: EksMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
    
    inline def setPodName(value: String): Self = StObject.set(x, "podName", value.asInstanceOf[js.Any])
    
    inline def setPodNameUndefined: Self = StObject.set(x, "podName", js.undefined)
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setVolumes(value: EksVolumes): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: EksVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
