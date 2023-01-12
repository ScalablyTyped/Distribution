package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddonRequest extends StObject {
  
  /**
    * The name of the add-on. The name must match one of the names returned by  DescribeAddonVersions .
    */
  var addonName: String
  
  /**
    * The version of the add-on. The version must match one of the versions returned by  DescribeAddonVersions .
    */
  var addonVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster to create the add-on for.
    */
  var clusterName: ClusterName
  
  /**
    * How to resolve field value conflicts for an Amazon EKS add-on. Conflicts are handled based on the value you choose:    None – If the self-managed version of the add-on is installed on your cluster, Amazon EKS doesn't change the value. Creation of the add-on might fail.    Overwrite – If the self-managed version of the add-on is installed on your cluster and the Amazon EKS default value is different than the existing value, Amazon EKS changes the value to the Amazon EKS default value.    Preserve – Not supported. You can set this value when updating an add-on though. For more information, see UpdateAddon.   If you don't currently have the self-managed version of the add-on installed on your cluster, the Amazon EKS add-on is installed. Amazon EKS sets all values to default values, regardless of the option that you specify.
    */
  var resolveConflicts: js.UndefOr[ResolveConflicts] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role must be assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role, then the add-on uses the permissions assigned to the node IAM role. For more information, see Amazon EKS node IAM role in the Amazon EKS User Guide.  To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your cluster. For more information, see Enabling IAM roles for service accounts on your cluster in the Amazon EKS User Guide. 
    */
  var serviceAccountRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The metadata to apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value. You define both.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAddonRequest {
  
  inline def apply(addonName: String, clusterName: ClusterName): CreateAddonRequest = {
    val __obj = js.Dynamic.literal(addonName = addonName.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddonRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAddonRequest] (val x: Self) extends AnyVal {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionUndefined: Self = StObject.set(x, "addonVersion", js.undefined)
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: ClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setResolveConflicts(value: ResolveConflicts): Self = StObject.set(x, "resolveConflicts", value.asInstanceOf[js.Any])
    
    inline def setResolveConflictsUndefined: Self = StObject.set(x, "resolveConflicts", js.undefined)
    
    inline def setServiceAccountRoleArn(value: RoleArn): Self = StObject.set(x, "serviceAccountRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountRoleArnUndefined: Self = StObject.set(x, "serviceAccountRoleArn", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
