package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRuntimeStatistics extends StObject {
  
  /**
    * Stage statistics such as input and output rows and bytes, execution time, and stage state. This information also includes substages and the query stage plan.
    */
  var OutputStage: js.UndefOr[QueryStage] = js.undefined
  
  var Rows: js.UndefOr[QueryRuntimeStatisticsRows] = js.undefined
  
  var Timeline: js.UndefOr[QueryRuntimeStatisticsTimeline] = js.undefined
}
object QueryRuntimeStatistics {
  
  inline def apply(): QueryRuntimeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRuntimeStatistics]
  }
  
  extension [Self <: QueryRuntimeStatistics](x: Self) {
    
    inline def setOutputStage(value: QueryStage): Self = StObject.set(x, "OutputStage", value.asInstanceOf[js.Any])
    
    inline def setOutputStageUndefined: Self = StObject.set(x, "OutputStage", js.undefined)
    
    inline def setRows(value: QueryRuntimeStatisticsRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    inline def setTimeline(value: QueryRuntimeStatisticsTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
