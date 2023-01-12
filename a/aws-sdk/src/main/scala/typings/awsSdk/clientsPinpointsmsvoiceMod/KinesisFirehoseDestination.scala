package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that can write data to an Amazon Kinesis Data Firehose stream.
    */
  var DeliveryStreamArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose destination that you want to use in the event destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
}
object KinesisFirehoseDestination {
  
  inline def apply(): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamArn(value: String): Self = StObject.set(x, "DeliveryStreamArn", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamArnUndefined: Self = StObject.set(x, "DeliveryStreamArn", js.undefined)
    
    inline def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
  }
}
