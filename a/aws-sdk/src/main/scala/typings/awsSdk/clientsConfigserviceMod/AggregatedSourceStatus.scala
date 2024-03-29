package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedSourceStatus extends StObject {
  
  /**
    * The region authorized to collect aggregated data.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AwsRegion] = js.undefined
  
  /**
    * The error code that Config returned when the source account aggregation last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The message indicating that the source account aggregation failed due to an error.
    */
  var LastErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Filters the last updated status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.undefined
  
  /**
    * The time of the last update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source account ID or an organization.
    */
  var SourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The source account or an organization.
    */
  var SourceType: js.UndefOr[AggregatedSourceType] = js.undefined
}
object AggregatedSourceStatus {
  
  inline def apply(): AggregatedSourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedSourceStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedSourceStatus] (val x: Self) extends AnyVal {
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setLastErrorCode(value: String): Self = StObject.set(x, "LastErrorCode", value.asInstanceOf[js.Any])
    
    inline def setLastErrorCodeUndefined: Self = StObject.set(x, "LastErrorCode", js.undefined)
    
    inline def setLastErrorMessage(value: String): Self = StObject.set(x, "LastErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setLastErrorMessageUndefined: Self = StObject.set(x, "LastErrorMessage", js.undefined)
    
    inline def setLastUpdateStatus(value: AggregatedSourceStatusType): Self = StObject.set(x, "LastUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusUndefined: Self = StObject.set(x, "LastUpdateStatus", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setSourceType(value: AggregatedSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
