package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevEnvironmentResponse extends StObject {
  
  /**
    * The user-specified alias for the Dev Environment. 
    */
  var alias: js.UndefOr[GetDevEnvironmentResponseAliasString] = js.undefined
  
  /**
    * The system-generated unique ID of the user who created the Dev Environment. 
    */
  var creatorId: GetDevEnvironmentResponseCreatorIdString
  
  /**
    * The system-generated unique ID of the Dev Environment. 
    */
  var id: Uuid
  
  /**
    * Information about the integrated development environment (IDE) configured for the Dev Environment. 
    */
  var ides: js.UndefOr[Ides] = js.undefined
  
  /**
    * The amount of time the Dev Environment will run without any activity detected before stopping, in minutes.
    */
  var inactivityTimeoutMinutes: InactivityTimeoutMinutes
  
  /**
    * The Amazon EC2 instace type to use for the Dev Environment. 
    */
  var instanceType: InstanceType
  
  /**
    * The time when the Dev Environment was last updated, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * Information about the amount of storage allocated to the Dev Environment. By default, a Dev Environment is configured to have 16GB of persistent storage.
    */
  var persistentStorage: PersistentStorage
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The source repository that contains the branch cloned into the Dev Environment. 
    */
  var repositories: DevEnvironmentRepositorySummaries
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
  
  /**
    * The current status of the Dev Environment.
    */
  var status: DevEnvironmentStatus
  
  /**
    * The reason for the status.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
}
object GetDevEnvironmentResponse {
  
  inline def apply(
    creatorId: GetDevEnvironmentResponseCreatorIdString,
    id: Uuid,
    inactivityTimeoutMinutes: InactivityTimeoutMinutes,
    instanceType: InstanceType,
    lastUpdatedTime: js.Date,
    persistentStorage: PersistentStorage,
    projectName: NameString,
    repositories: DevEnvironmentRepositorySummaries,
    spaceName: NameString,
    status: DevEnvironmentStatus
  ): GetDevEnvironmentResponse = {
    val __obj = js.Dynamic.literal(creatorId = creatorId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inactivityTimeoutMinutes = inactivityTimeoutMinutes.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], persistentStorage = persistentStorage.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevEnvironmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDevEnvironmentResponse] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: GetDevEnvironmentResponseAliasString): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCreatorId(value: GetDevEnvironmentResponseCreatorIdString): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdes(value: Ides): Self = StObject.set(x, "ides", value.asInstanceOf[js.Any])
    
    inline def setIdesUndefined: Self = StObject.set(x, "ides", js.undefined)
    
    inline def setIdesVarargs(value: Ide*): Self = StObject.set(x, "ides", js.Array(value*))
    
    inline def setInactivityTimeoutMinutes(value: InactivityTimeoutMinutes): Self = StObject.set(x, "inactivityTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setPersistentStorage(value: PersistentStorage): Self = StObject.set(x, "persistentStorage", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setRepositories(value: DevEnvironmentRepositorySummaries): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: DevEnvironmentRepositorySummary*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DevEnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
