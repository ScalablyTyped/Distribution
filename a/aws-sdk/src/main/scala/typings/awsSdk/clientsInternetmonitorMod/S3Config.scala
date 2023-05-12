package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Config extends StObject {
  
  /**
    * The Amazon S3 bucket name.
    */
  var BucketName: js.UndefOr[S3ConfigBucketNameString] = js.undefined
  
  /**
    * The Amazon S3 bucket prefix.
    */
  var BucketPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The status of publishing Internet Monitor internet measurements to an Amazon S3 bucket.
    */
  var LogDeliveryStatus: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.LogDeliveryStatus] = js.undefined
}
object S3Config {
  
  inline def apply(): S3Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Config] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3ConfigBucketNameString): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setBucketPrefix(value: String): Self = StObject.set(x, "BucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "BucketPrefix", js.undefined)
    
    inline def setLogDeliveryStatus(value: LogDeliveryStatus): Self = StObject.set(x, "LogDeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryStatusUndefined: Self = StObject.set(x, "LogDeliveryStatus", js.undefined)
  }
}
