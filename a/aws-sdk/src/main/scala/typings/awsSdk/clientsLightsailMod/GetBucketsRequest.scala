package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketsRequest extends StObject {
  
  /**
    * The name of the bucket for which to return information. When omitted, the response includes all of your buckets in the Amazon Web Services Region where the request is made.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    * A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket using the SetResourceAccessForBucket action.
    */
  var includeConnectedResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetBuckets request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetBucketsRequest {
  
  inline def apply(): GetBucketsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketsRequest] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setIncludeConnectedResources(value: Boolean): Self = StObject.set(x, "includeConnectedResources", value.asInstanceOf[js.Any])
    
    inline def setIncludeConnectedResourcesUndefined: Self = StObject.set(x, "includeConnectedResources", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
