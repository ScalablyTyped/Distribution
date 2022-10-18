package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueryRequest extends StObject {
  
  /**
    * The ARN (or the ID suffix of the ARN) of an event data store on which the specified query was run.
    */
  var EventDataStore: EventDataStoreArn
  
  /**
    * The query ID.
    */
  var QueryId: UUID
}
object DescribeQueryRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn, QueryId: UUID): DescribeQueryRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQueryRequest]
  }
  
  extension [Self <: DescribeQueryRequest](x: Self) {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
