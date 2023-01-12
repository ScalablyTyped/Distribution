package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPreviewFinding extends StObject {
  
  /**
    * The action in the analyzed policy statement that an external principal has permission to perform.
    */
  var action: js.UndefOr[ActionList] = js.undefined
  
  /**
    * Provides context on how the access preview finding compares to existing access identified in IAM Access Analyzer.    New - The finding is for newly-introduced access.    Unchanged - The preview finding is an existing finding that would remain unchanged.    Changed - The preview finding is an existing finding with a change in status.   For example, a Changed finding with preview status Resolved and existing status Active indicates the existing Active finding would become Resolved as a result of the proposed permissions change.
    */
  var changeType: FindingChangeType
  
  /**
    * The condition in the analyzed policy statement that resulted in a finding.
    */
  var condition: js.UndefOr[ConditionKeyMap] = js.undefined
  
  /**
    * The time at which the access preview finding was created.
    */
  var createdAt: js.Date
  
  /**
    * An error.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * The existing ID of the finding in IAM Access Analyzer, provided only for existing findings.
    */
  var existingFindingId: js.UndefOr[FindingId] = js.undefined
  
  /**
    * The existing status of the finding, provided only for existing findings.
    */
  var existingFindingStatus: js.UndefOr[FindingStatus] = js.undefined
  
  /**
    * The ID of the access preview finding. This ID uniquely identifies the element in the list of access preview findings and is not related to the finding ID in Access Analyzer.
    */
  var id: AccessPreviewFindingId
  
  /**
    * Indicates whether the policy that generated the finding allows public access to the resource.
    */
  var isPublic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The external principal that has access to a resource within the zone of trust.
    */
  var principal: js.UndefOr[PrincipalMap] = js.undefined
  
  /**
    * The resource that an external principal has access to. This is the resource associated with the access preview.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account ID that owns the resource. For most Amazon Web Services resources, the owning account is the account in which the resource was created.
    */
  var resourceOwnerAccount: String
  
  /**
    * The type of the resource that can be accessed in the finding.
    */
  var resourceType: ResourceType
  
  /**
    * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
    */
  var sources: js.UndefOr[FindingSourceList] = js.undefined
  
  /**
    * The preview status of the finding. This is what the status of the finding would be after permissions deployment. For example, a Changed finding with preview status Resolved and existing status Active indicates the existing Active finding would become Resolved as a result of the proposed permissions change.
    */
  var status: FindingStatus
}
object AccessPreviewFinding {
  
  inline def apply(
    changeType: FindingChangeType,
    createdAt: js.Date,
    id: AccessPreviewFindingId,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    status: FindingStatus
  ): AccessPreviewFinding = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPreviewFinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPreviewFinding] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionList): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setChangeType(value: FindingChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: ConditionKeyMap): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExistingFindingId(value: FindingId): Self = StObject.set(x, "existingFindingId", value.asInstanceOf[js.Any])
    
    inline def setExistingFindingIdUndefined: Self = StObject.set(x, "existingFindingId", js.undefined)
    
    inline def setExistingFindingStatus(value: FindingStatus): Self = StObject.set(x, "existingFindingStatus", value.asInstanceOf[js.Any])
    
    inline def setExistingFindingStatusUndefined: Self = StObject.set(x, "existingFindingStatus", js.undefined)
    
    inline def setId(value: AccessPreviewFindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    inline def setPrincipal(value: PrincipalMap): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerAccount(value: String): Self = StObject.set(x, "resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSources(value: FindingSourceList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: FindingSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setStatus(value: FindingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
