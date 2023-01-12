package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  /**
    * The ID of the attachment.
    */
  var AttachmentId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.AttachmentId] = js.undefined
  
  /**
    * The policy rule number associated with the attachment.
    */
  var AttachmentPolicyRuleNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of attachment.
    */
  var AttachmentType: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.AttachmentType] = js.undefined
  
  /**
    * The ARN of a core network.
    */
  var CoreNetworkArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkArn] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The timestamp when the attachment was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Region where the edge is located.
    */
  var EdgeLocation: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of the attachment account owner.
    */
  var OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The attachment to move from one segment to another.
    */
  var ProposedSegmentChange: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ProposedSegmentChange] = js.undefined
  
  /**
    * The attachment resource ARN.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The name of the segment attachment.
    */
  var SegmentName: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The state of the attachment.
    */
  var State: js.UndefOr[AttachmentState] = js.undefined
  
  /**
    * The tags associated with the attachment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The timestamp when the attachment was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object Attachment {
  
  inline def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    inline def setAttachmentId(value: AttachmentId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setAttachmentPolicyRuleNumber(value: Integer): Self = StObject.set(x, "AttachmentPolicyRuleNumber", value.asInstanceOf[js.Any])
    
    inline def setAttachmentPolicyRuleNumberUndefined: Self = StObject.set(x, "AttachmentPolicyRuleNumber", js.undefined)
    
    inline def setAttachmentType(value: AttachmentType): Self = StObject.set(x, "AttachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "AttachmentType", js.undefined)
    
    inline def setCoreNetworkArn(value: CoreNetworkArn): Self = StObject.set(x, "CoreNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkArnUndefined: Self = StObject.set(x, "CoreNetworkArn", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEdgeLocation(value: ExternalRegionCode): Self = StObject.set(x, "EdgeLocation", value.asInstanceOf[js.Any])
    
    inline def setEdgeLocationUndefined: Self = StObject.set(x, "EdgeLocation", js.undefined)
    
    inline def setOwnerAccountId(value: AWSAccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setProposedSegmentChange(value: ProposedSegmentChange): Self = StObject.set(x, "ProposedSegmentChange", value.asInstanceOf[js.Any])
    
    inline def setProposedSegmentChangeUndefined: Self = StObject.set(x, "ProposedSegmentChange", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setSegmentName(value: ConstrainedString): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
    
    inline def setState(value: AttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
