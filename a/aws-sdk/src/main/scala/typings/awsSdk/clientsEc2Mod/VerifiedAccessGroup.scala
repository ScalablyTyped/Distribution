package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessGroup extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The deletion time.
    */
  var DeletionTime: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Amazon Web Services Verified Access group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The last updated time.
    */
  var LastUpdatedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account number that owns the group.
    */
  var Owner: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN of the Verified Access group.
    */
  var VerifiedAccessGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Verified Access group.
    */
  var VerifiedAccessGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access instance.
    */
  var VerifiedAccessInstanceId: js.UndefOr[String] = js.undefined
}
object VerifiedAccessGroup {
  
  inline def apply(): VerifiedAccessGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessGroup] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastUpdatedTime(value: String): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVerifiedAccessGroupArn(value: String): Self = StObject.set(x, "VerifiedAccessGroupArn", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupArnUndefined: Self = StObject.set(x, "VerifiedAccessGroupArn", js.undefined)
    
    inline def setVerifiedAccessGroupId(value: String): Self = StObject.set(x, "VerifiedAccessGroupId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupIdUndefined: Self = StObject.set(x, "VerifiedAccessGroupId", js.undefined)
    
    inline def setVerifiedAccessInstanceId(value: String): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdUndefined: Self = StObject.set(x, "VerifiedAccessInstanceId", js.undefined)
  }
}
