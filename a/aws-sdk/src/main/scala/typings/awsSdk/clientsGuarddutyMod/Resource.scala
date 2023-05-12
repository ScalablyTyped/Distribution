package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The IAM access key details (user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  var AccessKeyDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AccessKeyDetails] = js.undefined
  
  var ContainerDetails: js.UndefOr[Container] = js.undefined
  
  /**
    * Contains list of scanned and skipped EBS volumes with details.
    */
  var EbsVolumeDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.EbsVolumeDetails] = js.undefined
  
  /**
    * Contains information about the details of the ECS Cluster.
    */
  var EcsClusterDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.EcsClusterDetails] = js.undefined
  
  /**
    * Details about the EKS cluster involved in a Kubernetes finding.
    */
  var EksClusterDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.EksClusterDetails] = js.undefined
  
  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  var InstanceDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.InstanceDetails] = js.undefined
  
  /**
    * Details about the Kubernetes user and workload involved in a Kubernetes finding.
    */
  var KubernetesDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.KubernetesDetails] = js.undefined
  
  /**
    * Contains information about the Lambda function that was involved in a finding.
    */
  var LambdaDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.LambdaDetails] = js.undefined
  
  /**
    * Contains information about the database instance to which an anomalous login attempt was made.
    */
  var RdsDbInstanceDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.RdsDbInstanceDetails] = js.undefined
  
  /**
    * Contains information about the user details through which anomalous login attempt was made.
    */
  var RdsDbUserDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.RdsDbUserDetails] = js.undefined
  
  /**
    * The type of Amazon Web Services resource.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Contains information on the S3 bucket.
    */
  var S3BucketDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.S3BucketDetails] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyDetails(value: AccessKeyDetails): Self = StObject.set(x, "AccessKeyDetails", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyDetailsUndefined: Self = StObject.set(x, "AccessKeyDetails", js.undefined)
    
    inline def setContainerDetails(value: Container): Self = StObject.set(x, "ContainerDetails", value.asInstanceOf[js.Any])
    
    inline def setContainerDetailsUndefined: Self = StObject.set(x, "ContainerDetails", js.undefined)
    
    inline def setEbsVolumeDetails(value: EbsVolumeDetails): Self = StObject.set(x, "EbsVolumeDetails", value.asInstanceOf[js.Any])
    
    inline def setEbsVolumeDetailsUndefined: Self = StObject.set(x, "EbsVolumeDetails", js.undefined)
    
    inline def setEcsClusterDetails(value: EcsClusterDetails): Self = StObject.set(x, "EcsClusterDetails", value.asInstanceOf[js.Any])
    
    inline def setEcsClusterDetailsUndefined: Self = StObject.set(x, "EcsClusterDetails", js.undefined)
    
    inline def setEksClusterDetails(value: EksClusterDetails): Self = StObject.set(x, "EksClusterDetails", value.asInstanceOf[js.Any])
    
    inline def setEksClusterDetailsUndefined: Self = StObject.set(x, "EksClusterDetails", js.undefined)
    
    inline def setInstanceDetails(value: InstanceDetails): Self = StObject.set(x, "InstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setInstanceDetailsUndefined: Self = StObject.set(x, "InstanceDetails", js.undefined)
    
    inline def setKubernetesDetails(value: KubernetesDetails): Self = StObject.set(x, "KubernetesDetails", value.asInstanceOf[js.Any])
    
    inline def setKubernetesDetailsUndefined: Self = StObject.set(x, "KubernetesDetails", js.undefined)
    
    inline def setLambdaDetails(value: LambdaDetails): Self = StObject.set(x, "LambdaDetails", value.asInstanceOf[js.Any])
    
    inline def setLambdaDetailsUndefined: Self = StObject.set(x, "LambdaDetails", js.undefined)
    
    inline def setRdsDbInstanceDetails(value: RdsDbInstanceDetails): Self = StObject.set(x, "RdsDbInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setRdsDbInstanceDetailsUndefined: Self = StObject.set(x, "RdsDbInstanceDetails", js.undefined)
    
    inline def setRdsDbUserDetails(value: RdsDbUserDetails): Self = StObject.set(x, "RdsDbUserDetails", value.asInstanceOf[js.Any])
    
    inline def setRdsDbUserDetailsUndefined: Self = StObject.set(x, "RdsDbUserDetails", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setS3BucketDetails(value: S3BucketDetails): Self = StObject.set(x, "S3BucketDetails", value.asInstanceOf[js.Any])
    
    inline def setS3BucketDetailsUndefined: Self = StObject.set(x, "S3BucketDetails", js.undefined)
    
    inline def setS3BucketDetailsVarargs(value: S3BucketDetail*): Self = StObject.set(x, "S3BucketDetails", js.Array(value*))
  }
}
