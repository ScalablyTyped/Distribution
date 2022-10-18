package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSensorStatisticsRequest extends StObject {
  
  /**
    *  The name of the dataset associated with the list of Sensor Statistics. 
    */
  var DatasetName: typings.awsSdk.clientsLookoutequipmentMod.DatasetName
  
  /**
    *  The ingestion job id associated with the list of Sensor Statistics. To get sensor statistics for a particular ingestion job id, both dataset name and ingestion job id must be submitted as inputs. 
    */
  var IngestionJobId: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.IngestionJobId] = js.undefined
  
  /**
    * Specifies the maximum number of sensors for which to retrieve statistics. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token indicating where to continue the listing of sensor statistics. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListSensorStatisticsRequest {
  
  inline def apply(DatasetName: DatasetName): ListSensorStatisticsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSensorStatisticsRequest]
  }
  
  extension [Self <: ListSensorStatisticsRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setIngestionJobId(value: IngestionJobId): Self = StObject.set(x, "IngestionJobId", value.asInstanceOf[js.Any])
    
    inline def setIngestionJobIdUndefined: Self = StObject.set(x, "IngestionJobId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
