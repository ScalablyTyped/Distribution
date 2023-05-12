package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityResultDescription extends StObject {
  
  /**
    * The table name associated with the data quality result.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsGlueMod.DataSource] = js.undefined
  
  /**
    * The job name associated with the data quality result.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The job run ID associated with the data quality result.
    */
  var JobRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The unique result ID for this data quality result.
    */
  var ResultId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The time that the run started for this data quality result.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
}
object DataQualityResultDescription {
  
  inline def apply(): DataQualityResultDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityResultDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityResultDescription] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunId(value: HashString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
    
    inline def setResultId(value: HashString): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "ResultId", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
  }
}
