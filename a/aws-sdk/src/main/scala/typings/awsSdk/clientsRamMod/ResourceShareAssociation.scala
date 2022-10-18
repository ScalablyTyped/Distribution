package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceShareAssociation extends StObject {
  
  /**
    * The associated entity. This can be either of the following:   For a resource association, this is the Amazon Resoure Name (ARN) of the resource.   For principal associations, this is one of the following:   The ID of an Amazon Web Services account   The Amazon Resoure Name (ARN) of an organization in Organizations   The ARN of an organizational unit (OU) in Organizations   The ARN of an IAM role   The ARN of an IAM user    
    */
  var associatedEntity: js.UndefOr[String] = js.undefined
  
  /**
    * The type of entity included in this association.
    */
  var associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined
  
  /**
    * The date and time when the association was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the principal belongs to the same organization in Organizations as the Amazon Web Services account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the association.
    */
  var status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
  
  /**
    * A message about the status of the association.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object ResourceShareAssociation {
  
  inline def apply(): ResourceShareAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareAssociation]
  }
  
  extension [Self <: ResourceShareAssociation](x: Self) {
    
    inline def setAssociatedEntity(value: String): Self = StObject.set(x, "associatedEntity", value.asInstanceOf[js.Any])
    
    inline def setAssociatedEntityUndefined: Self = StObject.set(x, "associatedEntity", js.undefined)
    
    inline def setAssociationType(value: ResourceShareAssociationType): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    inline def setAssociationTypeUndefined: Self = StObject.set(x, "associationType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setResourceShareName(value: String): Self = StObject.set(x, "resourceShareName", value.asInstanceOf[js.Any])
    
    inline def setResourceShareNameUndefined: Self = StObject.set(x, "resourceShareName", js.undefined)
    
    inline def setStatus(value: ResourceShareAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
