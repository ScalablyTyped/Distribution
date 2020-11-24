package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finding extends js.Object {
  
  /**
    * The action in the analyzed policy statement that an external principal has permission to use.
    */
  var action: js.UndefOr[ActionList] = js.native
  
  /**
    * The time at which the resource was analyzed.
    */
  var analyzedAt: Timestamp = js.native
  
  /**
    * The condition in the analyzed policy statement that resulted in a finding.
    */
  var condition: ConditionKeyMap = js.native
  
  /**
    * The time at which the finding was generated.
    */
  var createdAt: Timestamp = js.native
  
  /**
    * An error.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * The ID of the finding.
    */
  var id: FindingId = js.native
  
  /**
    * Indicates whether the policy that generated the finding allows public access to the resource.
    */
  var isPublic: js.UndefOr[Boolean] = js.native
  
  /**
    * The external principal that access to a resource within the zone of trust.
    */
  var principal: js.UndefOr[PrincipalMap] = js.native
  
  /**
    * The resource that an external principal has access to.
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String = js.native
  
  /**
    * The type of the resource reported in the finding.
    */
  var resourceType: ResourceType = js.native
  
  /**
    * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
    */
  var sources: js.UndefOr[FindingSourceList] = js.native
  
  /**
    * The current status of the finding.
    */
  var status: FindingStatus = js.native
  
  /**
    * The time at which the finding was updated.
    */
  var updatedAt: Timestamp = js.native
}
object Finding {
  
  @scala.inline
  def apply(
    analyzedAt: Timestamp,
    condition: ConditionKeyMap,
    createdAt: Timestamp,
    id: FindingId,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    status: FindingStatus,
    updatedAt: Timestamp
  ): Finding = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  @scala.inline
  implicit class FindingOps[Self <: Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyzedAt(value: Timestamp): Self = this.set("analyzedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: ConditionKeyMap): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FindingId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerAccount(value: String): Self = this.set("resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FindingStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVarargs(value: String*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: ActionList): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPublic: Self = this.set("isPublic", js.undefined)
    
    @scala.inline
    def setPrincipal(value: PrincipalMap): Self = this.set("principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: FindingSource*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: FindingSourceList): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
}
