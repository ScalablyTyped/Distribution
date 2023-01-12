package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoggingOptionsResponse extends StObject {
  
  /**
    * Returns information about log delivery to Amazon CloudWatch Logs.
    */
  var cloudWatchLogDelivery: CloudWatchLogDeliveryOptions
}
object GetLoggingOptionsResponse {
  
  inline def apply(cloudWatchLogDelivery: CloudWatchLogDeliveryOptions): GetLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal(cloudWatchLogDelivery = cloudWatchLogDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggingOptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogDelivery(value: CloudWatchLogDeliveryOptions): Self = StObject.set(x, "cloudWatchLogDelivery", value.asInstanceOf[js.Any])
  }
}
