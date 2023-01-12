package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttachmentRequest extends StObject {
  
  /**
    * A unique identifier for the attachment.
    */
  var AttachmentId: ArtifactId
  
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken
}
object GetAttachmentRequest {
  
  inline def apply(AttachmentId: ArtifactId, ConnectionToken: ParticipantToken): GetAttachmentRequest = {
    val __obj = js.Dynamic.literal(AttachmentId = AttachmentId.asInstanceOf[js.Any], ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttachmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAttachmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAttachmentId(value: ArtifactId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
  }
}
