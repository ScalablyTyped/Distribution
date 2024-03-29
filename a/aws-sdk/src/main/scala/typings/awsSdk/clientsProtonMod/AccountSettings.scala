package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service role that Proton uses for provisioning pipelines. Proton assumes this role for CodeBuild-based provisioning.
    */
  var pipelineCodebuildRoleArn: js.UndefOr[RoleArnOrEmptyString] = js.undefined
  
  /**
    * The linked repository for pipeline provisioning. Required if you have environments configured for self-managed provisioning with services that include pipelines. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository.
    */
  var pipelineProvisioningRepository: js.UndefOr[RepositoryBranch] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
    */
  var pipelineServiceRoleArn: js.UndefOr[RoleArnOrEmptyString] = js.undefined
}
object AccountSettings {
  
  inline def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    inline def setPipelineCodebuildRoleArn(value: RoleArnOrEmptyString): Self = StObject.set(x, "pipelineCodebuildRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineCodebuildRoleArnUndefined: Self = StObject.set(x, "pipelineCodebuildRoleArn", js.undefined)
    
    inline def setPipelineProvisioningRepository(value: RepositoryBranch): Self = StObject.set(x, "pipelineProvisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioningRepositoryUndefined: Self = StObject.set(x, "pipelineProvisioningRepository", js.undefined)
    
    inline def setPipelineServiceRoleArn(value: RoleArnOrEmptyString): Self = StObject.set(x, "pipelineServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineServiceRoleArnUndefined: Self = StObject.set(x, "pipelineServiceRoleArn", js.undefined)
  }
}
