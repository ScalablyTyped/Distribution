package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransferProgress extends StObject {
  
  /**
    * Describes the data transfer rate in MB's per second.
    */
  var CurrentRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Describes the total amount of data that has been transfered in MB's.
    */
  var DataTransferredInMegaBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * Describes the number of seconds that have elapsed during the data transfer.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * Describes the estimated number of seconds remaining to complete the transfer.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * Describes the status of the cluster. While the transfer is in progress the status is transferringdata.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the total amount of data to be transfered in megabytes.
    */
  var TotalDataInMegaBytes: js.UndefOr[Long] = js.undefined
}
object DataTransferProgress {
  
  inline def apply(): DataTransferProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransferProgress]
  }
  
  extension [Self <: DataTransferProgress](x: Self) {
    
    inline def setCurrentRateInMegaBytesPerSecond(value: DoubleOptional): Self = StObject.set(x, "CurrentRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setCurrentRateInMegaBytesPerSecondUndefined: Self = StObject.set(x, "CurrentRateInMegaBytesPerSecond", js.undefined)
    
    inline def setDataTransferredInMegaBytes(value: Long): Self = StObject.set(x, "DataTransferredInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setDataTransferredInMegaBytesUndefined: Self = StObject.set(x, "DataTransferredInMegaBytes", js.undefined)
    
    inline def setElapsedTimeInSeconds(value: LongOptional): Self = StObject.set(x, "ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeInSecondsUndefined: Self = StObject.set(x, "ElapsedTimeInSeconds", js.undefined)
    
    inline def setEstimatedTimeToCompletionInSeconds(value: LongOptional): Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeToCompletionInSecondsUndefined: Self = StObject.set(x, "EstimatedTimeToCompletionInSeconds", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTotalDataInMegaBytes(value: Long): Self = StObject.set(x, "TotalDataInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalDataInMegaBytesUndefined: Self = StObject.set(x, "TotalDataInMegaBytes", js.undefined)
  }
}
