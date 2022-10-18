package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAttachmentUploadResponse extends StObject {
  
  /**
    * A unique identifier for the attachment.
    */
  var AttachmentId: js.UndefOr[ArtifactId] = js.undefined
  
  /**
    * Fields to be used while uploading the attachment.
    */
  var UploadMetadata: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.UploadMetadata] = js.undefined
}
object StartAttachmentUploadResponse {
  
  inline def apply(): StartAttachmentUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAttachmentUploadResponse]
  }
  
  extension [Self <: StartAttachmentUploadResponse](x: Self) {
    
    inline def setAttachmentId(value: ArtifactId): Self = StObject.set(x, "AttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "AttachmentId", js.undefined)
    
    inline def setUploadMetadata(value: UploadMetadata): Self = StObject.set(x, "UploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataUndefined: Self = StObject.set(x, "UploadMetadata", js.undefined)
  }
}
