package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSageMakerNotebookInstanceDetails extends StObject {
  
  /**
    *  A list of Amazon Elastic Inference instance types to associate with the notebook instance. Currently, only one instance type can be associated with a notebook instance. 
    */
  var AcceleratorTypes: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  An array of up to three Git repositories associated with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git repositories with SageMaker notebook instances in the Amazon SageMaker Developer Guide. 
    */
  var AdditionalCodeRepositories: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git repositories with SageMaker notebook instances in the Amazon SageMaker Developer Guide. 
    */
  var DefaultCodeRepository: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Sets whether SageMaker provides internet access to the notebook instance. If you set this to Disabled, this notebook instance is able to access resources only in your VPC, and is not be able to connect to SageMaker training and endpoint services unless you configure a Network Address Translation (NAT) Gateway in your VPC. 
    */
  var DirectInternetAccess: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  If status of the instance is Failed, the reason it failed. 
    */
  var FailureReason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Information on the IMDS configuration of the notebook instance. 
    */
  var InstanceMetadataServiceConfiguration: js.UndefOr[AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails] = js.undefined
  
  /**
    *  The type of machine learning (ML) compute instance to launch for the notebook instance. 
    */
  var InstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of an Key Management Service (KMS) key that SageMaker uses to encrypt data on the storage volume attached to your notebook instance. The KMS key you provide must be enabled. For information, see Enabling and disabling keys in the Key Management Service Developer Guide. 
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The network interface ID that SageMaker created when the instance was created. 
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the notebook instance. 
    */
  var NotebookInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of a notebook instance lifecycle configuration. 
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the new notebook instance. 
    */
  var NotebookInstanceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The status of the notebook instance. 
    */
  var NotebookInstanceStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The platform identifier of the notebook instance runtime environment. 
    */
  var PlatformIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role associated with the instance. 
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Whether root access is enabled or disabled for users of the notebook instance. 
    */
  var RootAccess: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The VPC security group IDs. 
    */
  var SecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    *  The ID of the VPC subnet to which you have a connectivity from your ML compute instance. 
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The URL that you use to connect to the Jupyter notebook that is running in your notebook instance. 
    */
  var Url: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The size, in GB, of the ML storage volume to attach to the notebook instance. 
    */
  var VolumeSizeInGB: js.UndefOr[Integer] = js.undefined
}
object AwsSageMakerNotebookInstanceDetails {
  
  inline def apply(): AwsSageMakerNotebookInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSageMakerNotebookInstanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSageMakerNotebookInstanceDetails] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorTypes(value: NonEmptyStringList): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value*))
    
    inline def setAdditionalCodeRepositories(value: NonEmptyStringList): Self = StObject.set(x, "AdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "AdditionalCodeRepositories", js.undefined)
    
    inline def setAdditionalCodeRepositoriesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AdditionalCodeRepositories", js.Array(value*))
    
    inline def setDefaultCodeRepository(value: NonEmptyString): Self = StObject.set(x, "DefaultCodeRepository", value.asInstanceOf[js.Any])
    
    inline def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DefaultCodeRepository", js.undefined)
    
    inline def setDirectInternetAccess(value: NonEmptyString): Self = StObject.set(x, "DirectInternetAccess", value.asInstanceOf[js.Any])
    
    inline def setDirectInternetAccessUndefined: Self = StObject.set(x, "DirectInternetAccess", js.undefined)
    
    inline def setFailureReason(value: NonEmptyString): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInstanceMetadataServiceConfiguration(value: AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails): Self = StObject.set(x, "InstanceMetadataServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataServiceConfigurationUndefined: Self = StObject.set(x, "InstanceMetadataServiceConfiguration", js.undefined)
    
    inline def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNotebookInstanceArn(value: NonEmptyString): Self = StObject.set(x, "NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceArnUndefined: Self = StObject.set(x, "NotebookInstanceArn", js.undefined)
    
    inline def setNotebookInstanceLifecycleConfigName(value: NonEmptyString): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceLifecycleConfigNameUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", js.undefined)
    
    inline def setNotebookInstanceName(value: NonEmptyString): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceNameUndefined: Self = StObject.set(x, "NotebookInstanceName", js.undefined)
    
    inline def setNotebookInstanceStatus(value: NonEmptyString): Self = StObject.set(x, "NotebookInstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceStatusUndefined: Self = StObject.set(x, "NotebookInstanceStatus", js.undefined)
    
    inline def setPlatformIdentifier(value: NonEmptyString): Self = StObject.set(x, "PlatformIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdentifierUndefined: Self = StObject.set(x, "PlatformIdentifier", js.undefined)
    
    inline def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRootAccess(value: NonEmptyString): Self = StObject.set(x, "RootAccess", value.asInstanceOf[js.Any])
    
    inline def setRootAccessUndefined: Self = StObject.set(x, "RootAccess", js.undefined)
    
    inline def setSecurityGroups(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setUrl(value: NonEmptyString): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setVolumeSizeInGB(value: Integer): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
