package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingSummary extends StObject {
  
  /**
    * The action in the analyzed policy statement that an external principal has permission to use.
    */
  var action: js.UndefOr[ActionList] = js.undefined
  
  /**
    * The time at which the resource-based policy that generated the finding was analyzed.
    */
  var analyzedAt: js.Date
  
  /**
    * The condition in the analyzed policy statement that resulted in a finding.
    */
  var condition: ConditionKeyMap
  
  /**
    * The time at which the finding was created.
    */
  var createdAt: js.Date
  
  /**
    * The error that resulted in an Error finding.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the finding.
    */
  var id: FindingId
  
  /**
    * Indicates whether the finding reports a resource that has a policy that allows public access.
    */
  var isPublic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The external principal that has access to a resource within the zone of trust.
    */
  var principal: js.UndefOr[PrincipalMap] = js.undefined
  
  /**
    * The resource that the external principal has access to.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account ID that owns the resource.
    */
  var resourceOwnerAccount: String
  
  /**
    * The type of the resource that the external principal has access to.
    */
  var resourceType: ResourceType
  
  /**
    * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
    */
  var sources: js.UndefOr[FindingSourceList] = js.undefined
  
  /**
    * The status of the finding.
    */
  var status: FindingStatus
  
  /**
    * The time at which the finding was most recently updated.
    */
  var updatedAt: js.Date
}
object FindingSummary {
  
  inline def apply(
    analyzedAt: js.Date,
    condition: ConditionKeyMap,
    createdAt: js.Date,
    id: FindingId,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    status: FindingStatus,
    updatedAt: js.Date
  ): FindingSummary = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingSummary] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionList): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setAnalyzedAt(value: js.Date): Self = StObject.set(x, "analyzedAt", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: ConditionKeyMap): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: FindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
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
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
