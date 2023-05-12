package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceShare extends StObject {
  
  /**
    * Indicates whether principals outside your organization in Organizations can be associated with a resource share.    True – the resource share can be shared with any Amazon Web Services account.    False – the resource share can be shared with only accounts in the same organization as the account that owns the resource share.  
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the resource share was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates what features are available for this resource share. This parameter can have one of the following values:    STANDARD – A resource share that supports all functionality. These resource shares are visible to all principals you share the resource share with. You can modify these resource shares in RAM using the console or APIs. This resource share might have been created by RAM, or it might have been CREATED_FROM_POLICY and then promoted.    CREATED_FROM_POLICY – The customer manually shared a resource by attaching a resource-based policy. That policy did not match any existing managed permissions, so RAM created this customer managed permission automatically on the customer's behalf based on the attached policy document. This type of resource share is visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote it. For more information, see PromoteResourceShareCreatedFromPolicy.    PROMOTING_TO_STANDARD – This resource share was originally CREATED_FROM_POLICY, but the customer ran the PromoteResourceShareCreatedFromPolicy and that operation is still in progress. This value changes to STANDARD when complete.  
    */
  var featureSet: js.UndefOr[ResourceShareFeatureSet] = js.undefined
  
  /**
    * The date and time when the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the resource share.
    */
  var owningAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the resource share.
    */
  var status: js.UndefOr[ResourceShareStatus] = js.undefined
  
  /**
    * A message about the status of the resource share.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The tag key and value pairs attached to the resource share.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object ResourceShare {
  
  inline def apply(): ResourceShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShare]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceShare] (val x: Self) extends AnyVal {
    
    inline def setAllowExternalPrincipals(value: Boolean): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setFeatureSet(value: ResourceShareFeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwningAccountId(value: String): Self = StObject.set(x, "owningAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwningAccountIdUndefined: Self = StObject.set(x, "owningAccountId", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setStatus(value: ResourceShareStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
