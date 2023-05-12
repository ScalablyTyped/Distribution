package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetColumnStatisticsForTableResponse extends StObject {
  
  /**
    * List of ColumnStatistics.
    */
  var ColumnStatisticsList: js.UndefOr[typings.awsSdk.clientsGlueMod.ColumnStatisticsList] = js.undefined
  
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var Errors: js.UndefOr[ColumnErrors] = js.undefined
}
object GetColumnStatisticsForTableResponse {
  
  inline def apply(): GetColumnStatisticsForTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetColumnStatisticsForTableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetColumnStatisticsForTableResponse] (val x: Self) extends AnyVal {
    
    inline def setColumnStatisticsList(value: ColumnStatisticsList): Self = StObject.set(x, "ColumnStatisticsList", value.asInstanceOf[js.Any])
    
    inline def setColumnStatisticsListUndefined: Self = StObject.set(x, "ColumnStatisticsList", js.undefined)
    
    inline def setColumnStatisticsListVarargs(value: ColumnStatistics*): Self = StObject.set(x, "ColumnStatisticsList", js.Array(value*))
    
    inline def setErrors(value: ColumnErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ColumnError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
