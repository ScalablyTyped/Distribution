package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogKinesisDataFirehoseDestination extends StObject {
  
  /**
    * The delivery status.
    */
  var DeliveryStatus: js.UndefOr[VerifiedAccessLogDeliveryStatus] = js.undefined
  
  /**
    * The ID of the delivery stream.
    */
  var DeliveryStream: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object VerifiedAccessLogKinesisDataFirehoseDestination {
  
  inline def apply(): VerifiedAccessLogKinesisDataFirehoseDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessLogKinesisDataFirehoseDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogKinesisDataFirehoseDestination] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStatus(value: VerifiedAccessLogDeliveryStatus): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStatusUndefined: Self = StObject.set(x, "DeliveryStatus", js.undefined)
    
    inline def setDeliveryStream(value: String): Self = StObject.set(x, "DeliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "DeliveryStream", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
