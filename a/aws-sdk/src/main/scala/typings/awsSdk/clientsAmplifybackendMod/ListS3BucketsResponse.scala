package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListS3BucketsResponse extends StObject {
  
  /**
    * The list of S3 buckets.
    */
  var Buckets: js.UndefOr[ListOfS3BucketInfo] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListS3BucketsResponse {
  
  inline def apply(): ListS3BucketsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3BucketsResponse]
  }
  
  extension [Self <: ListS3BucketsResponse](x: Self) {
    
    inline def setBuckets(value: ListOfS3BucketInfo): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    inline def setBucketsVarargs(value: S3BucketInfo*): Self = StObject.set(x, "Buckets", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
