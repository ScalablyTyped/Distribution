package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketsResult extends StObject {
  
  /**
    * An object that describes the synchronization status of the Amazon S3 account-level block public access feature for your Lightsail buckets. For more information about this feature and how it affects Lightsail buckets, see Block public access for buckets in Amazon Lightsail.
    */
  var accountLevelBpaSync: js.UndefOr[AccountLevelBpaSync] = js.undefined
  
  /**
    * An array of objects that describe buckets.
    */
  var buckets: js.UndefOr[BucketList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetBuckets request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetBucketsResult {
  
  inline def apply(): GetBucketsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketsResult] (val x: Self) extends AnyVal {
    
    inline def setAccountLevelBpaSync(value: AccountLevelBpaSync): Self = StObject.set(x, "accountLevelBpaSync", value.asInstanceOf[js.Any])
    
    inline def setAccountLevelBpaSyncUndefined: Self = StObject.set(x, "accountLevelBpaSync", js.undefined)
    
    inline def setBuckets(value: BucketList): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
