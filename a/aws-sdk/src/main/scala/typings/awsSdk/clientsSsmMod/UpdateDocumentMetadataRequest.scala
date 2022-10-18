package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentMetadataRequest extends StObject {
  
  /**
    * The change template review details to update.
    */
  var DocumentReviews: typings.awsSdk.clientsSsmMod.DocumentReviews
  
  /**
    * The version of a change template in which to update approval metadata.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The name of the change template for which a version's metadata is to be updated.
    */
  var Name: DocumentName
}
object UpdateDocumentMetadataRequest {
  
  inline def apply(DocumentReviews: DocumentReviews, Name: DocumentName): UpdateDocumentMetadataRequest = {
    val __obj = js.Dynamic.literal(DocumentReviews = DocumentReviews.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentMetadataRequest]
  }
  
  extension [Self <: UpdateDocumentMetadataRequest](x: Self) {
    
    inline def setDocumentReviews(value: DocumentReviews): Self = StObject.set(x, "DocumentReviews", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
