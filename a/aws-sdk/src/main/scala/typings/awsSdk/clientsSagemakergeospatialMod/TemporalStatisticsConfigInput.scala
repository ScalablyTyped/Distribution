package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalStatisticsConfigInput extends StObject {
  
  /**
    * The input for the temporal statistics grouping by time frequency option.
    */
  var GroupBy: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.GroupBy] = js.undefined
  
  /**
    * The list of the statistics method options.
    */
  var Statistics: TemporalStatisticsListInput
  
  /**
    * The list of target band names for the temporal statistic to calculate.
    */
  var TargetBands: js.UndefOr[StringListInput] = js.undefined
}
object TemporalStatisticsConfigInput {
  
  inline def apply(Statistics: TemporalStatisticsListInput): TemporalStatisticsConfigInput = {
    val __obj = js.Dynamic.literal(Statistics = Statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalStatisticsConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemporalStatisticsConfigInput] (val x: Self) extends AnyVal {
    
    inline def setGroupBy(value: GroupBy): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setStatistics(value: TemporalStatisticsListInput): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: TemporalStatistics*): Self = StObject.set(x, "Statistics", js.Array(value*))
    
    inline def setTargetBands(value: StringListInput): Self = StObject.set(x, "TargetBands", value.asInstanceOf[js.Any])
    
    inline def setTargetBandsUndefined: Self = StObject.set(x, "TargetBands", js.undefined)
    
    inline def setTargetBandsVarargs(value: String*): Self = StObject.set(x, "TargetBands", js.Array(value*))
  }
}
