package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzedResource extends StObject {
  
  /**
    * The actions that an external principal is granted permission to use by the policy that generated the finding.
    */
  var actions: js.UndefOr[ActionList] = js.undefined
  
  /**
    * The time at which the resource was analyzed.
    */
  var analyzedAt: Timestamp
  
  /**
    * The time at which the finding was created.
    */
  var createdAt: Timestamp
  
  /**
    * An error message.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the policy that generated the finding grants public access to the resource.
    */
  var isPublic: Boolean
  
  /**
    * The ARN of the resource that was analyzed.
    */
  var resourceArn: ResourceArn
  
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String
  
  /**
    * The type of the resource that was analyzed.
    */
  var resourceType: ResourceType
  
  /**
    * Indicates how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
    */
  var sharedVia: js.UndefOr[SharedViaList] = js.undefined
  
  /**
    * The current status of the finding generated from the analyzed resource.
    */
  var status: js.UndefOr[FindingStatus] = js.undefined
  
  /**
    * The time at which the finding was updated.
    */
  var updatedAt: Timestamp
}
object AnalyzedResource {
  
  @scala.inline
  def apply(
    analyzedAt: Timestamp,
    createdAt: Timestamp,
    isPublic: Boolean,
    resourceArn: ResourceArn,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    updatedAt: Timestamp
  ): AnalyzedResource = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResource]
  }
  
  @scala.inline
  implicit class AnalyzedResourceMutableBuilder[Self <: AnalyzedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzedAt(value: Timestamp): Self = StObject.set(x, "analyzedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerAccount(value: String): Self = StObject.set(x, "resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedVia(value: SharedViaList): Self = StObject.set(x, "sharedVia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedViaUndefined: Self = StObject.set(x, "sharedVia", js.undefined)
    
    @scala.inline
    def setSharedViaVarargs(value: String*): Self = StObject.set(x, "sharedVia", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: FindingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
