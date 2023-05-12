package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeriodToDateComputation extends StObject {
  
  /**
    * The ID for a computation.
    */
  var ComputationId: ShortRestrictiveResourceId
  
  /**
    * The name of a computation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The time granularity setup of period to date computation. Choose from the following options:   YEAR: Year to date.   MONTH: Month to date.  
    */
  var PeriodTimeGranularity: js.UndefOr[TimeGranularity] = js.undefined
  
  /**
    * The time field that is used in a computation.
    */
  var Time: DimensionField
  
  /**
    * The value field that is used in a computation.
    */
  var Value: js.UndefOr[MeasureField] = js.undefined
}
object PeriodToDateComputation {
  
  inline def apply(ComputationId: ShortRestrictiveResourceId, Time: DimensionField): PeriodToDateComputation = {
    val __obj = js.Dynamic.literal(ComputationId = ComputationId.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodToDateComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeriodToDateComputation] (val x: Self) extends AnyVal {
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPeriodTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "PeriodTimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setPeriodTimeGranularityUndefined: Self = StObject.set(x, "PeriodTimeGranularity", js.undefined)
    
    inline def setTime(value: DimensionField): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setValue(value: MeasureField): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
