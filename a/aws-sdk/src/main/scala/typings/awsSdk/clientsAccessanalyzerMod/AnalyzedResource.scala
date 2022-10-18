package typings.awsSdk.clientsAccessanalyzerMod

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
  var analyzedAt: js.Date
  
  /**
    * The time at which the finding was created.
    */
  var createdAt: js.Date
  
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
    * The Amazon Web Services account ID that owns the resource.
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
  var updatedAt: js.Date
}
object AnalyzedResource {
  
  inline def apply(
    analyzedAt: js.Date,
    createdAt: js.Date,
    isPublic: Boolean,
    resourceArn: ResourceArn,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    updatedAt: js.Date
  ): AnalyzedResource = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResource]
  }
  
  extension [Self <: AnalyzedResource](x: Self) {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAnalyzedAt(value: js.Date): Self = StObject.set(x, "analyzedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerAccount(value: String): Self = StObject.set(x, "resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSharedVia(value: SharedViaList): Self = StObject.set(x, "sharedVia", value.asInstanceOf[js.Any])
    
    inline def setSharedViaUndefined: Self = StObject.set(x, "sharedVia", js.undefined)
    
    inline def setSharedViaVarargs(value: String*): Self = StObject.set(x, "sharedVia", js.Array(value*))
    
    inline def setStatus(value: FindingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
