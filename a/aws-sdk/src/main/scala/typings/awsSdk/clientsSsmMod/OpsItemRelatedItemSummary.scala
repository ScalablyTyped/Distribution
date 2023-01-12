package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemRelatedItemSummary extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[OpsItemRelatedItemAssociationId] = js.undefined
  
  /**
    * The association type.
    */
  var AssociationType: js.UndefOr[OpsItemRelatedItemAssociationType] = js.undefined
  
  var CreatedBy: js.UndefOr[OpsItemIdentity] = js.undefined
  
  /**
    * The time the related-item association was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[OpsItemIdentity] = js.undefined
  
  /**
    * The time the related-item association was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The OpsItem ID.
    */
  var OpsItemId: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemId] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[OpsItemRelatedItemAssociationResourceType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the related-item resource.
    */
  var ResourceUri: js.UndefOr[OpsItemRelatedItemAssociationResourceUri] = js.undefined
}
object OpsItemRelatedItemSummary {
  
  inline def apply(): OpsItemRelatedItemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemRelatedItemSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsItemRelatedItemSummary] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: OpsItemRelatedItemAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationType(value: OpsItemRelatedItemAssociationType): Self = StObject.set(x, "AssociationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "AssociationType", js.undefined)
    
    inline def setCreatedBy(value: OpsItemIdentity): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setLastModifiedBy(value: OpsItemIdentity): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
    
    inline def setResourceType(value: OpsItemRelatedItemAssociationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setResourceUri(value: OpsItemRelatedItemAssociationResourceUri): Self = StObject.set(x, "ResourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "ResourceUri", js.undefined)
  }
}
