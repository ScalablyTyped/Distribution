package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the invitation. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var Arn: js.UndefOr[ArnString] = js.undefined
  
  /**
    * The date and time that the invitation was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the invitation expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, the invitee can no longer create a member and join the network using this InvitationId.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for the invitation.
    */
  var InvitationId: js.UndefOr[ResourceIdString] = js.undefined
  
  var NetworkSummary: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.NetworkSummary] = js.undefined
  
  /**
    * The status of the invitation:    PENDING - The invitee has not created a member to join the network, and the invitation has not yet expired.    ACCEPTING - The invitee has begun creating a member, and creation has not yet completed.    ACCEPTED - The invitee created a member and joined the network using the InvitationID.    REJECTED - The invitee rejected the invitation.    EXPIRED - The invitee neither created a member nor rejected the invitation before the ExpirationDate.  
    */
  var Status: js.UndefOr[InvitationStatus] = js.undefined
}
object Invitation {
  
  inline def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  
  extension [Self <: Invitation](x: Self) {
    
    inline def setArn(value: ArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setInvitationId(value: ResourceIdString): Self = StObject.set(x, "InvitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "InvitationId", js.undefined)
    
    inline def setNetworkSummary(value: NetworkSummary): Self = StObject.set(x, "NetworkSummary", value.asInstanceOf[js.Any])
    
    inline def setNetworkSummaryUndefined: Self = StObject.set(x, "NetworkSummary", js.undefined)
    
    inline def setStatus(value: InvitationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
