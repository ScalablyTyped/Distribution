package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataAggregation extends StObject {
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var DatasetRowDateGranularity: js.UndefOr[TopicTimeGranularity] = js.undefined
  
  /**
    * The column name for the default date.
    */
  var DefaultDateColumnName: js.UndefOr[LimitedString] = js.undefined
}
object DataAggregation {
  
  inline def apply(): DataAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataAggregation] (val x: Self) extends AnyVal {
    
    inline def setDatasetRowDateGranularity(value: TopicTimeGranularity): Self = StObject.set(x, "DatasetRowDateGranularity", value.asInstanceOf[js.Any])
    
    inline def setDatasetRowDateGranularityUndefined: Self = StObject.set(x, "DatasetRowDateGranularity", js.undefined)
    
    inline def setDefaultDateColumnName(value: LimitedString): Self = StObject.set(x, "DefaultDateColumnName", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateColumnNameUndefined: Self = StObject.set(x, "DefaultDateColumnName", js.undefined)
  }
}
