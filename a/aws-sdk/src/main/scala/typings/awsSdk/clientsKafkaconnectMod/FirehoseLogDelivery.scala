package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseLogDelivery extends StObject {
  
  /**
    * The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
    */
  var deliveryStream: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
    */
  var enabled: boolean
}
object FirehoseLogDelivery {
  
  inline def apply(enabled: boolean): FirehoseLogDelivery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseLogDelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirehoseLogDelivery] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStream(value: string): Self = StObject.set(x, "deliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "deliveryStream", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
