package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFolderMembersRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that contains the folder.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the folder.
    */
  var FolderId: RestrictiveResourceId
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFolderMembersRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, FolderId: RestrictiveResourceId): ListFolderMembersRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], FolderId = FolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFolderMembersRequest]
  }
  
  extension [Self <: ListFolderMembersRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
