package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppSummary extends StObject {
  
  /**
    * The unique ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * The creation time of the application.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.undefined
  
  /**
    * The ID of the application.
    */
  var importedAppId: js.UndefOr[ImportedAppId] = js.undefined
  
  /**
    * The last modified time of the application.
    */
  var lastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the application's most recent successful replication.
    */
  var latestReplicationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of the launch configuration.
    */
  var launchConfigurationStatus: js.UndefOr[AppLaunchConfigurationStatus] = js.undefined
  
  /**
    * Details about the latest launch of the application.
    */
  var launchDetails: js.UndefOr[LaunchDetails] = js.undefined
  
  /**
    * The launch status of the application.
    */
  var launchStatus: js.UndefOr[AppLaunchStatus] = js.undefined
  
  /**
    * A message related to the launch status of the application.
    */
  var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.undefined
  
  /**
    * The name of the application.
    */
  var name: js.UndefOr[AppName] = js.undefined
  
  /**
    * Status of the replication configuration.
    */
  var replicationConfigurationStatus: js.UndefOr[AppReplicationConfigurationStatus] = js.undefined
  
  /**
    * The replication status of the application.
    */
  var replicationStatus: js.UndefOr[AppReplicationStatus] = js.undefined
  
  /**
    * A message related to the replication status of the application.
    */
  var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.undefined
  
  /**
    * The name of the service role in the customer's account used by Server Migration Service.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * Status of the application.
    */
  var status: js.UndefOr[AppStatus] = js.undefined
  
  /**
    * A message related to the status of the application
    */
  var statusMessage: js.UndefOr[AppStatusMessage] = js.undefined
  
  /**
    * The number of server groups present in the application.
    */
  var totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined
  
  /**
    * The number of servers present in the application.
    */
  var totalServers: js.UndefOr[TotalServers] = js.undefined
}
object AppSummary {
  
  inline def apply(): AppSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppSummary] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: AppDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImportedAppId(value: ImportedAppId): Self = StObject.set(x, "importedAppId", value.asInstanceOf[js.Any])
    
    inline def setImportedAppIdUndefined: Self = StObject.set(x, "importedAppId", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLatestReplicationTime(value: js.Date): Self = StObject.set(x, "latestReplicationTime", value.asInstanceOf[js.Any])
    
    inline def setLatestReplicationTimeUndefined: Self = StObject.set(x, "latestReplicationTime", js.undefined)
    
    inline def setLaunchConfigurationStatus(value: AppLaunchConfigurationStatus): Self = StObject.set(x, "launchConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationStatusUndefined: Self = StObject.set(x, "launchConfigurationStatus", js.undefined)
    
    inline def setLaunchDetails(value: LaunchDetails): Self = StObject.set(x, "launchDetails", value.asInstanceOf[js.Any])
    
    inline def setLaunchDetailsUndefined: Self = StObject.set(x, "launchDetails", js.undefined)
    
    inline def setLaunchStatus(value: AppLaunchStatus): Self = StObject.set(x, "launchStatus", value.asInstanceOf[js.Any])
    
    inline def setLaunchStatusMessage(value: AppLaunchStatusMessage): Self = StObject.set(x, "launchStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStatusMessageUndefined: Self = StObject.set(x, "launchStatusMessage", js.undefined)
    
    inline def setLaunchStatusUndefined: Self = StObject.set(x, "launchStatus", js.undefined)
    
    inline def setName(value: AppName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplicationConfigurationStatus(value: AppReplicationConfigurationStatus): Self = StObject.set(x, "replicationConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationStatusUndefined: Self = StObject.set(x, "replicationConfigurationStatus", js.undefined)
    
    inline def setReplicationStatus(value: AppReplicationStatus): Self = StObject.set(x, "replicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusMessage(value: AppReplicationStatusMessage): Self = StObject.set(x, "replicationStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusMessageUndefined: Self = StObject.set(x, "replicationStatusMessage", js.undefined)
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "replicationStatus", js.undefined)
    
    inline def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    inline def setStatus(value: AppStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: AppStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalServerGroups(value: TotalServerGroups): Self = StObject.set(x, "totalServerGroups", value.asInstanceOf[js.Any])
    
    inline def setTotalServerGroupsUndefined: Self = StObject.set(x, "totalServerGroups", js.undefined)
    
    inline def setTotalServers(value: TotalServers): Self = StObject.set(x, "totalServers", value.asInstanceOf[js.Any])
    
    inline def setTotalServersUndefined: Self = StObject.set(x, "totalServers", js.undefined)
  }
}
