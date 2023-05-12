package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamSourceDescription extends StObject {
  
  /**
    * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
    */
  var DeliveryStartTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.KinesisStreamARN] = js.undefined
  
  /**
    * The ARN of the role used by the source Kinesis data stream. For more information, see Amazon Web Services Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RoleARN] = js.undefined
}
object KinesisStreamSourceDescription {
  
  inline def apply(): KinesisStreamSourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamSourceDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisStreamSourceDescription] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStartTimestamp(value: js.Date): Self = StObject.set(x, "DeliveryStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStartTimestampUndefined: Self = StObject.set(x, "DeliveryStartTimestamp", js.undefined)
    
    inline def setKinesisStreamARN(value: KinesisStreamARN): Self = StObject.set(x, "KinesisStreamARN", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamARNUndefined: Self = StObject.set(x, "KinesisStreamARN", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
