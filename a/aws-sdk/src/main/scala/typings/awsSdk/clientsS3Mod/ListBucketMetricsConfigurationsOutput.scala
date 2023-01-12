package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketMetricsConfigurationsOutput extends StObject {
  
  /**
    * The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.clientsS3Mod.IsTruncated] = js.undefined
  
  /**
    * The list of metrics configurations for a bucket.
    */
  var MetricsConfigurationList: js.UndefOr[typings.awsSdk.clientsS3Mod.MetricsConfigurationList] = js.undefined
  
  /**
    * The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}
object ListBucketMetricsConfigurationsOutput {
  
  inline def apply(): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBucketMetricsConfigurationsOutput] (val x: Self) extends AnyVal {
    
    inline def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    inline def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMetricsConfigurationList(value: MetricsConfigurationList): Self = StObject.set(x, "MetricsConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setMetricsConfigurationListUndefined: Self = StObject.set(x, "MetricsConfigurationList", js.undefined)
    
    inline def setMetricsConfigurationListVarargs(value: MetricsConfiguration*): Self = StObject.set(x, "MetricsConfigurationList", js.Array(value*))
    
    inline def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    inline def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
  }
}
