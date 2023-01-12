package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var DeliveryStreamArn: typings.awsSdk.clientsPinpointsmsvoicev2Mod.DeliveryStreamArn
  
  /**
    * The ARN of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon Firehose destination.
    */
  var IamRoleArn: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IamRoleArn
}
object KinesisFirehoseDestination {
  
  inline def apply(DeliveryStreamArn: DeliveryStreamArn, IamRoleArn: IamRoleArn): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamArn = DeliveryStreamArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamArn(value: DeliveryStreamArn): Self = StObject.set(x, "DeliveryStreamArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
  }
}
