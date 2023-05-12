package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteAttachmentUploadRequest extends StObject {
  
  /**
    * A list of unique identifiers for the attachments.
    */
  var AttachmentIds: AttachmentIdList
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: NonEmptyClientToken
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken
}
object CompleteAttachmentUploadRequest {
  
  inline def apply(
    AttachmentIds: AttachmentIdList,
    ClientToken: NonEmptyClientToken,
    ConnectionToken: ParticipantToken
  ): CompleteAttachmentUploadRequest = {
    val __obj = js.Dynamic.literal(AttachmentIds = AttachmentIds.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteAttachmentUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteAttachmentUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setAttachmentIds(value: AttachmentIdList): Self = StObject.set(x, "AttachmentIds", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdsVarargs(value: ArtifactId*): Self = StObject.set(x, "AttachmentIds", js.Array(value*))
    
    inline def setClientToken(value: NonEmptyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
  }
}
