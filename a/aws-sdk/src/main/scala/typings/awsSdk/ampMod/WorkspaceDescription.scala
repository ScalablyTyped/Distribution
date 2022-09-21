package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceDescription extends StObject {
  
  /**
    * Alias of this workspace.
    */
  var alias: js.UndefOr[WorkspaceAlias] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of this workspace.
    */
  var arn: WorkspaceArn
  
  /**
    * The time when the workspace was created.
    */
  var createdAt: js.Date
  
  /**
    * Prometheus endpoint URI.
    */
  var prometheusEndpoint: js.UndefOr[Uri] = js.undefined
  
  /**
    * The status of this workspace.
    */
  var status: WorkspaceStatus
  
  /**
    * The tags of this workspace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Unique string identifying this workspace.
    */
  var workspaceId: WorkspaceId
}
object WorkspaceDescription {
  
  inline def apply(arn: WorkspaceArn, createdAt: js.Date, status: WorkspaceStatus, workspaceId: WorkspaceId): WorkspaceDescription = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceDescription]
  }
  
  extension [Self <: WorkspaceDescription](x: Self) {
    
    inline def setAlias(value: WorkspaceAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setArn(value: WorkspaceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setPrometheusEndpoint(value: Uri): Self = StObject.set(x, "prometheusEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPrometheusEndpointUndefined: Self = StObject.set(x, "prometheusEndpoint", js.undefined)
    
    inline def setStatus(value: WorkspaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
