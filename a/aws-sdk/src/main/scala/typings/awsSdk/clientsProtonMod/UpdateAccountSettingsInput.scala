package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsInput extends StObject {
  
  /**
    * Set to true to remove a configured pipeline repository from the account settings. Don't set this field if you are updating the configured pipeline repository.
    */
  var deletePipelineProvisioningRepository: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Proton assumes this role for CodeBuild-based provisioning.
    */
  var pipelineCodebuildRoleArn: js.UndefOr[RoleArnOrEmptyString] = js.undefined
  
  /**
    * A linked repository for pipeline provisioning. Specify it if you have environments configured for self-managed provisioning with services that include pipelines. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository. To remove a previously configured repository, set deletePipelineProvisioningRepository to true, and don't set pipelineProvisioningRepository.
    */
  var pipelineProvisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning. To remove a previously configured ARN, specify an empty string.
    */
  var pipelineServiceRoleArn: js.UndefOr[RoleArnOrEmptyString] = js.undefined
}
object UpdateAccountSettingsInput {
  
  inline def apply(): UpdateAccountSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAccountSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setDeletePipelineProvisioningRepository(value: Boolean): Self = StObject.set(x, "deletePipelineProvisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setDeletePipelineProvisioningRepositoryUndefined: Self = StObject.set(x, "deletePipelineProvisioningRepository", js.undefined)
    
    inline def setPipelineCodebuildRoleArn(value: RoleArnOrEmptyString): Self = StObject.set(x, "pipelineCodebuildRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineCodebuildRoleArnUndefined: Self = StObject.set(x, "pipelineCodebuildRoleArn", js.undefined)
    
    inline def setPipelineProvisioningRepository(value: RepositoryBranchInput): Self = StObject.set(x, "pipelineProvisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioningRepositoryUndefined: Self = StObject.set(x, "pipelineProvisioningRepository", js.undefined)
    
    inline def setPipelineServiceRoleArn(value: RoleArnOrEmptyString): Self = StObject.set(x, "pipelineServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineServiceRoleArnUndefined: Self = StObject.set(x, "pipelineServiceRoleArn", js.undefined)
  }
}
