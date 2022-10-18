package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeliveryStreamInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.clientsFirehoseMod.DeliveryStreamName
  
  /**
    * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one destination per delivery stream.
    */
  var ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.undefined
  
  /**
    * The limit on the number of destinations to return. You can have one destination per delivery stream.
    */
  var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.undefined
}
object DescribeDeliveryStreamInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName): DescribeDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamInput]
  }
  
  extension [Self <: DescribeDeliveryStreamInput](x: Self) {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartDestinationId(value: DestinationId): Self = StObject.set(x, "ExclusiveStartDestinationId", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartDestinationIdUndefined: Self = StObject.set(x, "ExclusiveStartDestinationId", js.undefined)
    
    inline def setLimit(value: DescribeDeliveryStreamInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
