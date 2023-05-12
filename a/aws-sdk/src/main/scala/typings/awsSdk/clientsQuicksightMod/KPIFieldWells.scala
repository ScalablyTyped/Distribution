package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIFieldWells extends StObject {
  
  /**
    * The target value field wells of a KPI visual.
    */
  var TargetValues: js.UndefOr[MeasureFieldList] = js.undefined
  
  /**
    * The trend group field wells of a KPI visual.
    */
  var TrendGroups: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The value field wells of a KPI visual.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object KPIFieldWells {
  
  inline def apply(): KPIFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIFieldWells] (val x: Self) extends AnyVal {
    
    inline def setTargetValues(value: MeasureFieldList): Self = StObject.set(x, "TargetValues", value.asInstanceOf[js.Any])
    
    inline def setTargetValuesUndefined: Self = StObject.set(x, "TargetValues", js.undefined)
    
    inline def setTargetValuesVarargs(value: MeasureField*): Self = StObject.set(x, "TargetValues", js.Array(value*))
    
    inline def setTrendGroups(value: DimensionFieldList): Self = StObject.set(x, "TrendGroups", value.asInstanceOf[js.Any])
    
    inline def setTrendGroupsUndefined: Self = StObject.set(x, "TrendGroups", js.undefined)
    
    inline def setTrendGroupsVarargs(value: DimensionField*): Self = StObject.set(x, "TrendGroups", js.Array(value*))
    
    inline def setValues(value: MeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
