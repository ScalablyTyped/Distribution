package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnStatisticsError extends StObject {
  
  /**
    * The ColumnStatistics of the column.
    */
  var ColumnStatistics: js.UndefOr[typings.awsSdk.clientsGlueMod.ColumnStatistics] = js.undefined
  
  /**
    * An error message with the reason for the failure of an operation.
    */
  var Error: js.UndefOr[ErrorDetail] = js.undefined
}
object ColumnStatisticsError {
  
  inline def apply(): ColumnStatisticsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnStatisticsError]
  }
  
  extension [Self <: ColumnStatisticsError](x: Self) {
    
    inline def setColumnStatistics(value: ColumnStatistics): Self = StObject.set(x, "ColumnStatistics", value.asInstanceOf[js.Any])
    
    inline def setColumnStatisticsUndefined: Self = StObject.set(x, "ColumnStatistics", js.undefined)
    
    inline def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
