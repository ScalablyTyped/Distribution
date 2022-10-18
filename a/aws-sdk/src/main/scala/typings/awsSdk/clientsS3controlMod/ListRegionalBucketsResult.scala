package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegionalBucketsResult extends StObject {
  
  /**
    *  NextToken is sent when isTruncated is true, which means there are more buckets that can be listed. The next list requests to Amazon S3 can be continued with this NextToken. NextToken is obfuscated and is not a real key.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * 
    */
  var RegionalBucketList: js.UndefOr[typings.awsSdk.clientsS3controlMod.RegionalBucketList] = js.undefined
}
object ListRegionalBucketsResult {
  
  inline def apply(): ListRegionalBucketsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegionalBucketsResult]
  }
  
  extension [Self <: ListRegionalBucketsResult](x: Self) {
    
    inline def setNextToken(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegionalBucketList(value: RegionalBucketList): Self = StObject.set(x, "RegionalBucketList", value.asInstanceOf[js.Any])
    
    inline def setRegionalBucketListUndefined: Self = StObject.set(x, "RegionalBucketList", js.undefined)
    
    inline def setRegionalBucketListVarargs(value: RegionalBucket*): Self = StObject.set(x, "RegionalBucketList", js.Array(value*))
  }
}
