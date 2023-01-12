package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationDetails extends StObject {
  
  /**
    * The configuration details of the CloudWatch Logs destination.
    */
  var CloudWatchLogsDetails: js.UndefOr[CloudWatchLogsDestinationDetails] = js.undefined
  
  /**
    * The configuration details of the Kinesis Data Firehose destination.
    */
  var KinesisFirehoseDetails: js.UndefOr[KinesisFirehoseDestinationDetails] = js.undefined
}
object DestinationDetails {
  
  inline def apply(): DestinationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationDetails] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsDetails(value: CloudWatchLogsDestinationDetails): Self = StObject.set(x, "CloudWatchLogsDetails", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsDetailsUndefined: Self = StObject.set(x, "CloudWatchLogsDetails", js.undefined)
    
    inline def setKinesisFirehoseDetails(value: KinesisFirehoseDestinationDetails): Self = StObject.set(x, "KinesisFirehoseDetails", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDetailsUndefined: Self = StObject.set(x, "KinesisFirehoseDetails", js.undefined)
  }
}
