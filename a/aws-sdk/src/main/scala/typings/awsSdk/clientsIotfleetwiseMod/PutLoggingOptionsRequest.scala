package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLoggingOptionsRequest extends StObject {
  
  /**
    * Creates or updates the log delivery option to Amazon CloudWatch Logs.
    */
  var cloudWatchLogDelivery: CloudWatchLogDeliveryOptions
}
object PutLoggingOptionsRequest {
  
  inline def apply(cloudWatchLogDelivery: CloudWatchLogDeliveryOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(cloudWatchLogDelivery = cloudWatchLogDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
  
  extension [Self <: PutLoggingOptionsRequest](x: Self) {
    
    inline def setCloudWatchLogDelivery(value: CloudWatchLogDeliveryOptions): Self = StObject.set(x, "cloudWatchLogDelivery", value.asInstanceOf[js.Any])
  }
}
