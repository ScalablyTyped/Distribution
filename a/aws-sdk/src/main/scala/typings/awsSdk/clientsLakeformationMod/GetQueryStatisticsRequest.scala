package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryStatisticsRequest extends StObject {
  
  /**
    * The ID of the plan query operation.
    */
  var QueryId: GetQueryStatisticsRequestQueryIdString
}
object GetQueryStatisticsRequest {
  
  inline def apply(QueryId: GetQueryStatisticsRequestQueryIdString): GetQueryStatisticsRequest = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryStatisticsRequest]
  }
  
  extension [Self <: GetQueryStatisticsRequest](x: Self) {
    
    inline def setQueryId(value: GetQueryStatisticsRequestQueryIdString): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
