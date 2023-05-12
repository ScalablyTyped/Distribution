package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDevEnvironmentRequest extends StObject {
  
  /**
    * The user-defined alias for a Dev Environment.
    */
  var alias: js.UndefOr[CreateDevEnvironmentRequestAliasString] = js.undefined
  
  /**
    * A user-specified idempotency token. Idempotency ensures that an API request completes only once. With an idempotent request, if the original request completes successfully, the subsequent retries return the result from the original successful request and have no additional effect.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * Information about the integrated development environment (IDE) configured for a Dev Environment.  An IDE is required to create a Dev Environment. For Dev Environment creation, this field contains configuration information and must be provided. 
    */
  var ides: js.UndefOr[IdeConfigurationList] = js.undefined
  
  /**
    * The amount of time the Dev Environment will run without any activity detected before stopping, in minutes. Only whole integers are allowed. Dev Environments consume compute minutes when running.
    */
  var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined
  
  /**
    * The Amazon EC2 instace type to use for the Dev Environment. 
    */
  var instanceType: InstanceType
  
  /**
    * Information about the amount of storage allocated to the Dev Environment.   By default, a Dev Environment is configured to have 16GB of persistent storage when created from the Amazon CodeCatalyst console, but there is no default when programmatically creating a Dev Environment. Valid values for persistent storage are based on memory sizes in 16GB increments. Valid values are 16, 32, and 64. 
    */
  var persistentStorage: PersistentStorageConfiguration
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The source repository that contains the branch to clone into the Dev Environment. 
    */
  var repositories: js.UndefOr[RepositoriesInput] = js.undefined
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object CreateDevEnvironmentRequest {
  
  inline def apply(
    instanceType: InstanceType,
    persistentStorage: PersistentStorageConfiguration,
    projectName: NameString,
    spaceName: NameString
  ): CreateDevEnvironmentRequest = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], persistentStorage = persistentStorage.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDevEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: CreateDevEnvironmentRequestAliasString): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setIdes(value: IdeConfigurationList): Self = StObject.set(x, "ides", value.asInstanceOf[js.Any])
    
    inline def setIdesUndefined: Self = StObject.set(x, "ides", js.undefined)
    
    inline def setIdesVarargs(value: IdeConfiguration*): Self = StObject.set(x, "ides", js.Array(value*))
    
    inline def setInactivityTimeoutMinutes(value: InactivityTimeoutMinutes): Self = StObject.set(x, "inactivityTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setInactivityTimeoutMinutesUndefined: Self = StObject.set(x, "inactivityTimeoutMinutes", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setPersistentStorage(value: PersistentStorageConfiguration): Self = StObject.set(x, "persistentStorage", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setRepositories(value: RepositoriesInput): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: RepositoryInput*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
