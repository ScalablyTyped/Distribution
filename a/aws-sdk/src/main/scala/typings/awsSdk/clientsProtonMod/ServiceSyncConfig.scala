package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSyncConfig extends StObject {
  
  /**
    * The name of the code repository branch that holds the service code Proton will sync with.
    */
  var branch: GitBranchName
  
  /**
    * The file path to the service sync configuration file.
    */
  var filePath: OpsFilePath
  
  /**
    * The name of the code repository that holds the service code Proton will sync with.
    */
  var repositoryName: RepositoryName
  
  /**
    * The name of the repository provider that holds the repository Proton will sync with.
    */
  var repositoryProvider: RepositoryProvider
  
  /**
    * The name of the service that the service instance is added to.
    */
  var serviceName: ResourceName
}
object ServiceSyncConfig {
  
  inline def apply(
    branch: GitBranchName,
    filePath: OpsFilePath,
    repositoryName: RepositoryName,
    repositoryProvider: RepositoryProvider,
    serviceName: ResourceName
  ): ServiceSyncConfig = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], repositoryProvider = repositoryProvider.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSyncConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceSyncConfig] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: OpsFilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryProvider(value: RepositoryProvider): Self = StObject.set(x, "repositoryProvider", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
