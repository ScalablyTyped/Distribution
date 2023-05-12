package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshSchedule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the refresh schedule.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The type of refresh that a datset undergoes. Valid values are as follows:    FULL_REFRESH: A complete refresh of a dataset.    INCREMENTAL_REFRESH: A partial refresh of some rows of a dataset, based on the time window specified.   For more information on full and incremental refreshes, see Refreshing SPICE data in the Amazon QuickSight User Guide.
    */
  var RefreshType: IngestionType
  
  /**
    * The frequency for the refresh schedule.
    */
  var ScheduleFrequency: RefreshFrequency
  
  /**
    * An identifier for the refresh schedule.
    */
  var ScheduleId: String
  
  /**
    * Time after which the refresh schedule can be started, expressed in YYYY-MM-DDTHH:MM:SS format.
    */
  var StartAfterDateTime: js.UndefOr[js.Date] = js.undefined
}
object RefreshSchedule {
  
  inline def apply(RefreshType: IngestionType, ScheduleFrequency: RefreshFrequency, ScheduleId: String): RefreshSchedule = {
    val __obj = js.Dynamic.literal(RefreshType = RefreshType.asInstanceOf[js.Any], ScheduleFrequency = ScheduleFrequency.asInstanceOf[js.Any], ScheduleId = ScheduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshSchedule] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRefreshType(value: IngestionType): Self = StObject.set(x, "RefreshType", value.asInstanceOf[js.Any])
    
    inline def setScheduleFrequency(value: RefreshFrequency): Self = StObject.set(x, "ScheduleFrequency", value.asInstanceOf[js.Any])
    
    inline def setScheduleId(value: String): Self = StObject.set(x, "ScheduleId", value.asInstanceOf[js.Any])
    
    inline def setStartAfterDateTime(value: js.Date): Self = StObject.set(x, "StartAfterDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartAfterDateTimeUndefined: Self = StObject.set(x, "StartAfterDateTime", js.undefined)
  }
}
