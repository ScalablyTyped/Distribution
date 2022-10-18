package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSummary extends StObject {
  
  /**
    * A structure containing information about the authentication methods used in the workspace.
    */
  var authentication: AuthenticationSummary
  
  /**
    * The date that the workspace was created.
    */
  var created: js.Date
  
  /**
    * The customer-entered description of the workspace.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The URL endpoint to use to access the Grafana console in the workspace.
    */
  var endpoint: Endpoint
  
  /**
    * The Grafana version that the workspace is running.
    */
  var grafanaVersion: GrafanaVersion
  
  /**
    * The unique ID of the workspace.
    */
  var id: WorkspaceId
  
  /**
    * The most recent date that the workspace was modified.
    */
  var modified: js.Date
  
  /**
    * The name of the workspace.
    */
  var name: js.UndefOr[WorkspaceName] = js.undefined
  
  /**
    * The Amazon Web Services notification channels that Amazon Managed Grafana can automatically create IAM roles and permissions for, which allows Amazon Managed Grafana to use these channels.
    */
  var notificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined
  
  /**
    * The current status of the workspace.
    */
  var status: WorkspaceStatus
  
  /**
    * The list of tags associated with the workspace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object WorkspaceSummary {
  
  inline def apply(
    authentication: AuthenticationSummary,
    created: js.Date,
    endpoint: Endpoint,
    grafanaVersion: GrafanaVersion,
    id: WorkspaceId,
    modified: js.Date,
    status: WorkspaceStatus
  ): WorkspaceSummary = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], grafanaVersion = grafanaVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSummary]
  }
  
  extension [Self <: WorkspaceSummary](x: Self) {
    
    inline def setAuthentication(value: AuthenticationSummary): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setGrafanaVersion(value: GrafanaVersion): Self = StObject.set(x, "grafanaVersion", value.asInstanceOf[js.Any])
    
    inline def setId(value: WorkspaceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModified(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setName(value: WorkspaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationDestinations(value: NotificationDestinationsList): Self = StObject.set(x, "notificationDestinations", value.asInstanceOf[js.Any])
    
    inline def setNotificationDestinationsUndefined: Self = StObject.set(x, "notificationDestinations", js.undefined)
    
    inline def setNotificationDestinationsVarargs(value: NotificationDestinationType*): Self = StObject.set(x, "notificationDestinations", js.Array(value*))
    
    inline def setStatus(value: WorkspaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
