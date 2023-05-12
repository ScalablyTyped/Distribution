package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogS3Destination extends StObject {
  
  /**
    * The bucket name.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account number that owns the bucket.
    */
  var BucketOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The delivery status.
    */
  var DeliveryStatus: js.UndefOr[VerifiedAccessLogDeliveryStatus] = js.undefined
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The bucket prefix.
    */
  var Prefix: js.UndefOr[String] = js.undefined
}
object VerifiedAccessLogS3Destination {
  
  inline def apply(): VerifiedAccessLogS3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessLogS3Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogS3Destination] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setBucketOwner(value: String): Self = StObject.set(x, "BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setBucketOwnerUndefined: Self = StObject.set(x, "BucketOwner", js.undefined)
    
    inline def setDeliveryStatus(value: VerifiedAccessLogDeliveryStatus): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStatusUndefined: Self = StObject.set(x, "DeliveryStatus", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
