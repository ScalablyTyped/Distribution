package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeliveryStreamInput extends StObject {
  
  /**
    * Set this to true if you want to delete the delivery stream even if Kinesis Data Firehose is unable to retire the grant for the CMK. Kinesis Data Firehose might be unable to retire the grant due to a customer error, such as when the CMK or the grant are in an invalid state. If you force deletion, you can then use the RevokeGrant operation to revoke the grant you gave to Kinesis Data Firehose. If a failure to retire the grant happens due to an AWS KMS issue, Kinesis Data Firehose keeps retrying the delete operation. The default value is false.
    */
  var AllowForceDelete: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.clientsFirehoseMod.DeliveryStreamName
}
object DeleteDeliveryStreamInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName): DeleteDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeliveryStreamInput]
  }
  
  extension [Self <: DeleteDeliveryStreamInput](x: Self) {
    
    inline def setAllowForceDelete(value: BooleanObject): Self = StObject.set(x, "AllowForceDelete", value.asInstanceOf[js.Any])
    
    inline def setAllowForceDeleteUndefined: Self = StObject.set(x, "AllowForceDelete", js.undefined)
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
  }
}
