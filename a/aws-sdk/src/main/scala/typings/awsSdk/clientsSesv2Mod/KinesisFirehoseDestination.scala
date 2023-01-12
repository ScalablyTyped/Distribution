package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that the Amazon SES API v2 sends email events to.
    */
  var DeliveryStreamArn: AmazonResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the Amazon SES API v2 uses to send email events to the Amazon Kinesis Data Firehose stream.
    */
  var IamRoleArn: AmazonResourceName
}
object KinesisFirehoseDestination {
  
  inline def apply(DeliveryStreamArn: AmazonResourceName, IamRoleArn: AmazonResourceName): KinesisFirehoseDestination = {
    val __obj = js.Dynamic.literal(DeliveryStreamArn = DeliveryStreamArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisFirehoseDestination] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamArn(value: AmazonResourceName): Self = StObject.set(x, "DeliveryStreamArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: AmazonResourceName): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
  }
}
