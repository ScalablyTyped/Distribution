package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceShareInvitation extends StObject {
  
  /**
    * The date and time when the invitation was sent.
    */
  var invitationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that received the invitation.
    */
  var receiverAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the IAM user or role that received the invitation.
    */
  var receiverArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the resource share
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * To view the resources associated with a pending resource share invitation, use ListPendingInvitationResources.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that sent the invitation.
    */
  var senderAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the invitation.
    */
  var status: js.UndefOr[ResourceShareInvitationStatus] = js.undefined
}
object ResourceShareInvitation {
  
  inline def apply(): ResourceShareInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareInvitation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceShareInvitation] (val x: Self) extends AnyVal {
    
    inline def setInvitationTimestamp(value: js.Date): Self = StObject.set(x, "invitationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInvitationTimestampUndefined: Self = StObject.set(x, "invitationTimestamp", js.undefined)
    
    inline def setReceiverAccountId(value: String): Self = StObject.set(x, "receiverAccountId", value.asInstanceOf[js.Any])
    
    inline def setReceiverAccountIdUndefined: Self = StObject.set(x, "receiverAccountId", js.undefined)
    
    inline def setReceiverArn(value: String): Self = StObject.set(x, "receiverArn", value.asInstanceOf[js.Any])
    
    inline def setReceiverArnUndefined: Self = StObject.set(x, "receiverArn", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setResourceShareAssociations(value: ResourceShareAssociationList): Self = StObject.set(x, "resourceShareAssociations", value.asInstanceOf[js.Any])
    
    inline def setResourceShareAssociationsUndefined: Self = StObject.set(x, "resourceShareAssociations", js.undefined)
    
    inline def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = StObject.set(x, "resourceShareAssociations", js.Array(value*))
    
    inline def setResourceShareInvitationArn(value: String): Self = StObject.set(x, "resourceShareInvitationArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareInvitationArnUndefined: Self = StObject.set(x, "resourceShareInvitationArn", js.undefined)
    
    inline def setResourceShareName(value: String): Self = StObject.set(x, "resourceShareName", value.asInstanceOf[js.Any])
    
    inline def setResourceShareNameUndefined: Self = StObject.set(x, "resourceShareName", js.undefined)
    
    inline def setSenderAccountId(value: String): Self = StObject.set(x, "senderAccountId", value.asInstanceOf[js.Any])
    
    inline def setSenderAccountIdUndefined: Self = StObject.set(x, "senderAccountId", js.undefined)
    
    inline def setStatus(value: ResourceShareInvitationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
