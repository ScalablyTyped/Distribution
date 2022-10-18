package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketInventoryConfigurationsOutput extends StObject {
  
  /**
    * If sent in the request, the marker that is used as a starting point for this inventory configuration list response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The list of inventory configurations for a bucket.
    */
  var InventoryConfigurationList: js.UndefOr[typings.awsSdk.clientsS3Mod.InventoryConfigurationList] = js.undefined
  
  /**
    * Tells whether the returned list of inventory configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken is provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.clientsS3Mod.IsTruncated] = js.undefined
  
  /**
    * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}
object ListBucketInventoryConfigurationsOutput {
  
  inline def apply(): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
  
  extension [Self <: ListBucketInventoryConfigurationsOutput](x: Self) {
    
    inline def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    inline def setInventoryConfigurationList(value: InventoryConfigurationList): Self = StObject.set(x, "InventoryConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setInventoryConfigurationListUndefined: Self = StObject.set(x, "InventoryConfigurationList", js.undefined)
    
    inline def setInventoryConfigurationListVarargs(value: InventoryConfiguration*): Self = StObject.set(x, "InventoryConfigurationList", js.Array(value*))
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
  }
}
