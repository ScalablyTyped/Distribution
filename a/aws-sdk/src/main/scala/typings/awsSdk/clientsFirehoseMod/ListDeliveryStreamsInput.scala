package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeliveryStreamsInput extends StObject {
  
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.   This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
    */
  var DeliveryStreamType: js.UndefOr[typings.awsSdk.clientsFirehoseMod.DeliveryStreamType] = js.undefined
  
  /**
    * The list of delivery streams returned by this call to ListDeliveryStreams will start with the delivery stream whose name comes alphabetically immediately after the name you specify in ExclusiveStartDeliveryStreamName.
    */
  var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.undefined
  
  /**
    * The maximum number of delivery streams to list. The default value is 10.
    */
  var Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.undefined
}
object ListDeliveryStreamsInput {
  
  inline def apply(): ListDeliveryStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeliveryStreamsInput]
  }
  
  extension [Self <: ListDeliveryStreamsInput](x: Self) {
    
    inline def setDeliveryStreamType(value: DeliveryStreamType): Self = StObject.set(x, "DeliveryStreamType", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamTypeUndefined: Self = StObject.set(x, "DeliveryStreamType", js.undefined)
    
    inline def setExclusiveStartDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "ExclusiveStartDeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartDeliveryStreamNameUndefined: Self = StObject.set(x, "ExclusiveStartDeliveryStreamName", js.undefined)
    
    inline def setLimit(value: ListDeliveryStreamsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
