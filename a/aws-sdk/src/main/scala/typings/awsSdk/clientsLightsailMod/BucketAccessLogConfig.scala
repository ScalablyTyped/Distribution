package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketAccessLogConfig extends StObject {
  
  /**
    * The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the same account, and in the same Amazon Web Services Region as the source bucket.  This parameter is required when enabling the access log for a bucket, and should be omitted when disabling the access log. 
    */
  var destination: js.UndefOr[BucketName] = js.undefined
  
  /**
    * A Boolean value that indicates whether bucket access logging is enabled for the bucket.
    */
  var enabled: Boolean
  
  /**
    * The optional object prefix for the bucket access log. The prefix is an optional addition to the object key that organizes your access log files in the destination bucket. For example, if you specify a logs/ prefix, then each log object will begin with the logs/ prefix in its key (for example, logs/2021-11-01-21-32-16-E568B2907131C0C0).  This parameter can be optionally specified when enabling the access log for a bucket, and should be omitted when disabling the access log. 
    */
  var prefix: js.UndefOr[BucketAccessLogPrefix] = js.undefined
}
object BucketAccessLogConfig {
  
  inline def apply(enabled: Boolean): BucketAccessLogConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAccessLogConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketAccessLogConfig] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: BucketName): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: BucketAccessLogPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
