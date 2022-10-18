package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryRuntimeStatisticsOutput extends StObject {
  
  /**
    * Runtime statistics about the query execution.
    */
  var QueryRuntimeStatistics: js.UndefOr[typings.awsSdk.clientsAthenaMod.QueryRuntimeStatistics] = js.undefined
}
object GetQueryRuntimeStatisticsOutput {
  
  inline def apply(): GetQueryRuntimeStatisticsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryRuntimeStatisticsOutput]
  }
  
  extension [Self <: GetQueryRuntimeStatisticsOutput](x: Self) {
    
    inline def setQueryRuntimeStatistics(value: QueryRuntimeStatistics): Self = StObject.set(x, "QueryRuntimeStatistics", value.asInstanceOf[js.Any])
    
    inline def setQueryRuntimeStatisticsUndefined: Self = StObject.set(x, "QueryRuntimeStatistics", js.undefined)
  }
}
