package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRefreshScheduleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the dataset.
    */
  var DatasetId: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The definition of a refresh schedule.
    */
  var RefreshSchedule: js.UndefOr[TopicRefreshSchedule] = js.undefined
}
object TopicRefreshScheduleSummary {
  
  inline def apply(): TopicRefreshScheduleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRefreshScheduleSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicRefreshScheduleSummary] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetId(value: LimitedString): Self = StObject.set(x, "DatasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "DatasetId", js.undefined)
    
    inline def setDatasetName(value: LimitedString): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setRefreshSchedule(value: TopicRefreshSchedule): Self = StObject.set(x, "RefreshSchedule", value.asInstanceOf[js.Any])
    
    inline def setRefreshScheduleUndefined: Self = StObject.set(x, "RefreshSchedule", js.undefined)
  }
}
