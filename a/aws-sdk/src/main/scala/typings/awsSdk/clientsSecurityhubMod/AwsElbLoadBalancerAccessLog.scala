package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElbLoadBalancerAccessLog extends StObject {
  
  /**
    * The interval in minutes for publishing the access logs. You can publish access logs either every 5 minutes or every 60 minutes.
    */
  var EmitInterval: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether access logs are enabled for the load balancer.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the S3 bucket where the access logs are stored.
    */
  var S3BucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The logical hierarchy that was created for the S3 bucket. If a prefix is not provided, the log is placed at the root level of the bucket.
    */
  var S3BucketPrefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElbLoadBalancerAccessLog {
  
  inline def apply(): AwsElbLoadBalancerAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerAccessLog]
  }
  
  extension [Self <: AwsElbLoadBalancerAccessLog](x: Self) {
    
    inline def setEmitInterval(value: Integer): Self = StObject.set(x, "EmitInterval", value.asInstanceOf[js.Any])
    
    inline def setEmitIntervalUndefined: Self = StObject.set(x, "EmitInterval", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setS3BucketName(value: NonEmptyString): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3BucketPrefix(value: NonEmptyString): Self = StObject.set(x, "S3BucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3BucketPrefixUndefined: Self = StObject.set(x, "S3BucketPrefix", js.undefined)
  }
}
