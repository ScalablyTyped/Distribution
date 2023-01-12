package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterContainerInstanceRequest extends StObject {
  
  /**
    * The container instance attributes that this container instance supports.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to register your container instance with. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the container instance (if it was previously registered).
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The instance identity document for the EC2 instance to register. This document can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/document/ 
    */
  var instanceIdentityDocument: js.UndefOr[String] = js.undefined
  
  /**
    * The instance identity document signature for the EC2 instance to register. This signature can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/signature/ 
    */
  var instanceIdentityDocumentSignature: js.UndefOr[String] = js.undefined
  
  /**
    * The devices that are available on the container instance. The only supported device type is a GPU.
    */
  var platformDevices: js.UndefOr[PlatformDevices] = js.undefined
  
  /**
    * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists of a key and an optional value. You define both. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The resources available on the instance.
    */
  var totalResources: js.UndefOr[Resources] = js.undefined
  
  /**
    * The version information for the Amazon ECS container agent and Docker daemon that runs on the container instance.
    */
  var versionInfo: js.UndefOr[VersionInfo] = js.undefined
}
object RegisterContainerInstanceRequest {
  
  inline def apply(): RegisterContainerInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterContainerInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
    inline def setInstanceIdentityDocument(value: String): Self = StObject.set(x, "instanceIdentityDocument", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdentityDocumentSignature(value: String): Self = StObject.set(x, "instanceIdentityDocumentSignature", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdentityDocumentSignatureUndefined: Self = StObject.set(x, "instanceIdentityDocumentSignature", js.undefined)
    
    inline def setInstanceIdentityDocumentUndefined: Self = StObject.set(x, "instanceIdentityDocument", js.undefined)
    
    inline def setPlatformDevices(value: PlatformDevices): Self = StObject.set(x, "platformDevices", value.asInstanceOf[js.Any])
    
    inline def setPlatformDevicesUndefined: Self = StObject.set(x, "platformDevices", js.undefined)
    
    inline def setPlatformDevicesVarargs(value: PlatformDevice*): Self = StObject.set(x, "platformDevices", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTotalResources(value: Resources): Self = StObject.set(x, "totalResources", value.asInstanceOf[js.Any])
    
    inline def setTotalResourcesUndefined: Self = StObject.set(x, "totalResources", js.undefined)
    
    inline def setTotalResourcesVarargs(value: Resource*): Self = StObject.set(x, "totalResources", js.Array(value*))
    
    inline def setVersionInfo(value: VersionInfo): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    inline def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
  }
}
