package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotebookInstanceInput extends StObject {
  
  /**
    * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.undefined
  
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in Amazon Web Services CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.undefined
  
  /**
    * The Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in Amazon Web Services CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.undefined
  
  /**
    * A list of the Elastic Inference (EI) instance types to remove from this notebook instance. This operation is idempotent. If you specify an accelerator type that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.undefined
  
  /**
    * A list of names or URLs of the default Git repositories to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAdditionalCodeRepositories: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DisassociateAdditionalCodeRepositories] = js.undefined
  
  /**
    * The name or URL of the default Git repository to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateDefaultCodeRepository: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DisassociateDefaultCodeRepository] = js.undefined
  
  /**
    * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance. This operation is idempotent. If you specify a lifecycle configuration that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.undefined
  
  /**
    * Information on the IMDS configuration of the notebook instance
    */
  var InstanceMetadataServiceConfiguration: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InstanceMetadataServiceConfiguration] = js.undefined
  
  /**
    * The Amazon ML compute instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InstanceType] = js.undefined
  
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.undefined
  
  /**
    * The name of the notebook instance to update.
    */
  var NotebookInstanceName: typings.awsSdk.clientsSagemakerMod.NotebookInstanceName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access the notebook instance. For more information, see SageMaker Roles.   To be able to pass this role to SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  If you set this to Disabled, users don't have root access on the notebook instance, but lifecycle configuration scripts still run with root permissions. 
    */
  var RootAccess: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RootAccess] = js.undefined
  
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB. ML storage volumes are encrypted, so SageMaker can't determine the amount of available free space on the volume. Because of this, you can increase the volume size when you update a notebook instance, but you can't decrease the volume size. If you want to decrease the size of the ML storage volume in use, create a new notebook instance with the desired size.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
}
object UpdateNotebookInstanceInput {
  
  inline def apply(NotebookInstanceName: NotebookInstanceName): UpdateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookInstanceInput]
  }
  
  extension [Self <: UpdateNotebookInstanceInput](x: Self) {
    
    inline def setAcceleratorTypes(value: NotebookInstanceAcceleratorTypes): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: NotebookInstanceAcceleratorType*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value*))
    
    inline def setAdditionalCodeRepositories(value: AdditionalCodeRepositoryNamesOrUrls): Self = StObject.set(x, "AdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "AdditionalCodeRepositories", js.undefined)
    
    inline def setAdditionalCodeRepositoriesVarargs(value: CodeRepositoryNameOrUrl*): Self = StObject.set(x, "AdditionalCodeRepositories", js.Array(value*))
    
    inline def setDefaultCodeRepository(value: CodeRepositoryNameOrUrl): Self = StObject.set(x, "DefaultCodeRepository", value.asInstanceOf[js.Any])
    
    inline def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DefaultCodeRepository", js.undefined)
    
    inline def setDisassociateAcceleratorTypes(value: DisassociateNotebookInstanceAcceleratorTypes): Self = StObject.set(x, "DisassociateAcceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setDisassociateAcceleratorTypesUndefined: Self = StObject.set(x, "DisassociateAcceleratorTypes", js.undefined)
    
    inline def setDisassociateAdditionalCodeRepositories(value: DisassociateAdditionalCodeRepositories): Self = StObject.set(x, "DisassociateAdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    inline def setDisassociateAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "DisassociateAdditionalCodeRepositories", js.undefined)
    
    inline def setDisassociateDefaultCodeRepository(value: DisassociateDefaultCodeRepository): Self = StObject.set(x, "DisassociateDefaultCodeRepository", value.asInstanceOf[js.Any])
    
    inline def setDisassociateDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DisassociateDefaultCodeRepository", js.undefined)
    
    inline def setDisassociateLifecycleConfig(value: DisassociateNotebookInstanceLifecycleConfig): Self = StObject.set(x, "DisassociateLifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setDisassociateLifecycleConfigUndefined: Self = StObject.set(x, "DisassociateLifecycleConfig", js.undefined)
    
    inline def setInstanceMetadataServiceConfiguration(value: InstanceMetadataServiceConfiguration): Self = StObject.set(x, "InstanceMetadataServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataServiceConfigurationUndefined: Self = StObject.set(x, "InstanceMetadataServiceConfiguration", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "LifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigNameUndefined: Self = StObject.set(x, "LifecycleConfigName", js.undefined)
    
    inline def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRootAccess(value: RootAccess): Self = StObject.set(x, "RootAccess", value.asInstanceOf[js.Any])
    
    inline def setRootAccessUndefined: Self = StObject.set(x, "RootAccess", js.undefined)
    
    inline def setVolumeSizeInGB(value: NotebookInstanceVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
