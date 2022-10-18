package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetContentDeliveryDestination extends StObject {
  
  /**
    * Configuration information for delivery of dataset contents to IoT Events.
    */
  var iotEventsDestinationConfiguration: js.UndefOr[IotEventsDestinationConfiguration] = js.undefined
  
  /**
    * Configuration information for delivery of dataset contents to Amazon S3.
    */
  var s3DestinationConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
}
object DatasetContentDeliveryDestination {
  
  inline def apply(): DatasetContentDeliveryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentDeliveryDestination]
  }
  
  extension [Self <: DatasetContentDeliveryDestination](x: Self) {
    
    inline def setIotEventsDestinationConfiguration(value: IotEventsDestinationConfiguration): Self = StObject.set(x, "iotEventsDestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIotEventsDestinationConfigurationUndefined: Self = StObject.set(x, "iotEventsDestinationConfiguration", js.undefined)
    
    inline def setS3DestinationConfiguration(value: S3DestinationConfiguration): Self = StObject.set(x, "s3DestinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationConfigurationUndefined: Self = StObject.set(x, "s3DestinationConfiguration", js.undefined)
  }
}
