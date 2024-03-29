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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueryStatisticsRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryId(value: GetQueryStatisticsRequestQueryIdString): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
