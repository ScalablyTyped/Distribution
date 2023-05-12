package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityResultFilterCriteria extends StObject {
  
  /**
    * Filter results by the specified data source. For example, retrieving all results for an Glue table.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsGlueMod.DataSource] = js.undefined
  
  /**
    * Filter results by the specified job name.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * Filter results by the specified job run ID.
    */
  var JobRunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * Filter results by runs that started after this time.
    */
  var StartedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter results by runs that started before this time.
    */
  var StartedBefore: js.UndefOr[js.Date] = js.undefined
}
object DataQualityResultFilterCriteria {
  
  inline def apply(): DataQualityResultFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityResultFilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityResultFilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunId(value: HashString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
    
    inline def setStartedAfter(value: js.Date): Self = StObject.set(x, "StartedAfter", value.asInstanceOf[js.Any])
    
    inline def setStartedAfterUndefined: Self = StObject.set(x, "StartedAfter", js.undefined)
    
    inline def setStartedBefore(value: js.Date): Self = StObject.set(x, "StartedBefore", value.asInstanceOf[js.Any])
    
    inline def setStartedBeforeUndefined: Self = StObject.set(x, "StartedBefore", js.undefined)
  }
}
