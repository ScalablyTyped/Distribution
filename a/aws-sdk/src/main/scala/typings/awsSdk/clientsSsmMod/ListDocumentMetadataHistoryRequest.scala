package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentMetadataHistoryRequest extends StObject {
  
  /**
    * The version of the change template.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentVersion] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxResults] = js.undefined
  
  /**
    * The type of data for which details are being requested. Currently, the only supported value is DocumentReviews.
    */
  var Metadata: DocumentMetadataEnum
  
  /**
    * The name of the change template.
    */
  var Name: DocumentName
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object ListDocumentMetadataHistoryRequest {
  
  inline def apply(Metadata: DocumentMetadataEnum, Name: DocumentName): ListDocumentMetadataHistoryRequest = {
    val __obj = js.Dynamic.literal(Metadata = Metadata.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentMetadataHistoryRequest]
  }
  
  extension [Self <: ListDocumentMetadataHistoryRequest](x: Self) {
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetadata(value: DocumentMetadataEnum): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
