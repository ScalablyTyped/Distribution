package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDestinationConfiguration extends StObject {
  
  /**
    * Name of the Amazon Kinesis Firehose delivery stream where chat activity will be logged.
    */
  var deliveryStreamName: DeliveryStreamName
}
object FirehoseDestinationConfiguration {
  
  inline def apply(deliveryStreamName: DeliveryStreamName): FirehoseDestinationConfiguration = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirehoseDestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "deliveryStreamName", value.asInstanceOf[js.Any])
  }
}
