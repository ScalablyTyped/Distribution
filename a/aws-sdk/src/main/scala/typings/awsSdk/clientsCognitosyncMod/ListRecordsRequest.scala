package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecordsRequest extends StObject {
  
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: typings.awsSdk.clientsCognitosyncMod.DatasetName
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: typings.awsSdk.clientsCognitosyncMod.IdentityId
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typings.awsSdk.clientsCognitosyncMod.IdentityPoolId
  
  /**
    * The last server sync count for this record.
    */
  var LastSyncCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.undefined
  
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.SyncSessionToken] = js.undefined
}
object ListRecordsRequest {
  
  inline def apply(DatasetName: DatasetName, IdentityId: IdentityId, IdentityPoolId: IdentityPoolId): ListRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecordsRequest]
  }
  
  extension [Self <: ListRecordsRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setLastSyncCount(value: Long): Self = StObject.set(x, "LastSyncCount", value.asInstanceOf[js.Any])
    
    inline def setLastSyncCountUndefined: Self = StObject.set(x, "LastSyncCount", js.undefined)
    
    inline def setMaxResults(value: IntegerString): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSyncSessionToken(value: SyncSessionToken): Self = StObject.set(x, "SyncSessionToken", value.asInstanceOf[js.Any])
    
    inline def setSyncSessionTokenUndefined: Self = StObject.set(x, "SyncSessionToken", js.undefined)
  }
}
