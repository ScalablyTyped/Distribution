package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelQueryResponse extends StObject {
  
  /**
    * The ID of the canceled query.
    */
  var QueryId: UUID
  
  /**
    * Shows the status of a query after a CancelQuery request. Typically, the values shown are either RUNNING or CANCELLED.
    */
  var QueryStatus: typings.awsSdk.clientsCloudtrailMod.QueryStatus
}
object CancelQueryResponse {
  
  inline def apply(QueryId: UUID, QueryStatus: QueryStatus): CancelQueryResponse = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any], QueryStatus = QueryStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQueryResponse]
  }
  
  extension [Self <: CancelQueryResponse](x: Self) {
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryStatus(value: QueryStatus): Self = StObject.set(x, "QueryStatus", value.asInstanceOf[js.Any])
  }
}
