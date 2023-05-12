package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogKinesisDataFirehoseDestinationOptions extends StObject {
  
  /**
    * The ID of the delivery stream.
    */
  var DeliveryStream: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: Boolean
}
object VerifiedAccessLogKinesisDataFirehoseDestinationOptions {
  
  inline def apply(Enabled: Boolean): VerifiedAccessLogKinesisDataFirehoseDestinationOptions = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifiedAccessLogKinesisDataFirehoseDestinationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogKinesisDataFirehoseDestinationOptions] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStream(value: String): Self = StObject.set(x, "DeliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "DeliveryStream", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
