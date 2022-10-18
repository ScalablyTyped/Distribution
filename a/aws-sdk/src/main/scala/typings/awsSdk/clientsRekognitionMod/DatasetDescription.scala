package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetDescription extends StObject {
  
  /**
    *  The Unix timestamp for the time and date that the dataset was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status message code for the dataset. 
    */
  var DatasetStats: js.UndefOr[typings.awsSdk.clientsRekognitionMod.DatasetStats] = js.undefined
  
  /**
    *  The Unix timestamp for the date and time that the dataset was last updated. 
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of the dataset. 
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
  
  /**
    *  The status message for the dataset. 
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRekognitionMod.StatusMessage] = js.undefined
  
  /**
    *  The status message code for the dataset operation. If a service error occurs, try the API call again later. If a client error occurs, check the input parameters to the dataset API call that failed. 
    */
  var StatusMessageCode: js.UndefOr[DatasetStatusMessageCode] = js.undefined
}
object DatasetDescription {
  
  inline def apply(): DatasetDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetDescription]
  }
  
  extension [Self <: DatasetDescription](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDatasetStats(value: DatasetStats): Self = StObject.set(x, "DatasetStats", value.asInstanceOf[js.Any])
    
    inline def setDatasetStatsUndefined: Self = StObject.set(x, "DatasetStats", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageCode(value: DatasetStatusMessageCode): Self = StObject.set(x, "StatusMessageCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageCodeUndefined: Self = StObject.set(x, "StatusMessageCode", js.undefined)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
