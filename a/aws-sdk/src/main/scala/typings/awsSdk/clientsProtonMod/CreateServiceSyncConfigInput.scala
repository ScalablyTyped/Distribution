package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceSyncConfigInput extends StObject {
  
  /**
    * The repository branch for your Proton Ops file.
    */
  var branch: GitBranchName
  
  /**
    * The path to the Proton Ops file.
    */
  var filePath: OpsFilePath
  
  /**
    * The repository name.
    */
  var repositoryName: RepositoryName
  
  /**
    * The provider type for your repository.
    */
  var repositoryProvider: RepositoryProvider
  
  /**
    * The name of the service the Proton Ops file is for.
    */
  var serviceName: ResourceName
}
object CreateServiceSyncConfigInput {
  
  inline def apply(
    branch: GitBranchName,
    filePath: OpsFilePath,
    repositoryName: RepositoryName,
    repositoryProvider: RepositoryProvider,
    serviceName: ResourceName
  ): CreateServiceSyncConfigInput = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], repositoryProvider = repositoryProvider.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceSyncConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceSyncConfigInput] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: OpsFilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryProvider(value: RepositoryProvider): Self = StObject.set(x, "repositoryProvider", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
